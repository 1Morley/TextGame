package com.example.textgame.controller;

import com.example.textgame.Matrix;
import com.example.textgame.controller.Design.EndingStage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class GuiController {
    @FXML
    Label description;

    @FXML
    TextArea storyTextArea;

    private String[] storySegments;
    private int[][] storyConnections;
    private int currentSegment = 0;

    @FXML
    private void initialize() {
        Matrix matrix = new Matrix();
        storyConnections = matrix.connection();
        storySegments = matrix.getStorySegments();
        loadStorySegment(currentSegment);
    }
    @FXML public void testingDescription(String story){
        TextManipulation.typeText(story, description);
    }

    @FXML public void stopTxtAnimation(){
        TextManipulation.stopTypingAndShowFullText(description);
    }
    @FXML
    protected void choice1() {
        stopTxtAnimation();
        int nextSegment = getNextSegment(currentSegment,1);
        loadStorySegment(nextSegment);
    }

    @FXML
    protected void choice2() {
        stopTxtAnimation();
        int nextSegment = getNextSegment(currentSegment,2);
        loadStorySegment(nextSegment);
    }

    private int getNextSegment(int currentSegment, int choose) {
        for (int i = 0; i < storyConnections[currentSegment].length; i++) {
            if (storyConnections[currentSegment][i] == choose) {
                return i;
            }
        }
        return -1;
    }
    private void loadStorySegment(int segmentIndex) {
        hasTheGameEnded(segmentIndex);
        if (segmentIndex >= 0 && segmentIndex < storySegments.length) {
            currentSegment = segmentIndex;
           testingDescription(storySegments[segmentIndex]);
        } else {
            storyTextArea.setText("End of story or invalid path.");
        }
    }

    private void hasTheGameEnded(int segmentIndex) {
        String fileName = new Matrix().getFileNameForSegment(segmentIndex);
        System.out.println(fileName);
        if (fileName.matches("(?i).*ending.*") || fileName.equalsIgnoreCase("Story/Story/TowardForest.txt")) {
            String endingDescription = storySegments[segmentIndex];
                    endingGame(endingDescription);
        }

    }

    private void endingGame(String endingDescription) {
        stopTxtAnimation();
        Scene scene;
        Stage stage = (Stage) description.getScene().getWindow();
        if (stage == null) {
            System.out.println("Stage is null.");
            return;
        }

        FXMLLoader fxmlLoader;
        try {
            fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/textgame/End.fxml"));
            Parent root = fxmlLoader.load();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        EndingStage end = fxmlLoader.getController();
        try {
            end.endingScript(endingDescription);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
