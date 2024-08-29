package com.example.textgame.controller;

import com.example.textgame.Matrix;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class GuiController {
    @FXML
    Label description, roomName;

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
        int nextSegment = getNextSegment(currentSegment,1);
        loadStorySegment(nextSegment);
    }

    @FXML
    protected void choice2() {
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
        if (segmentIndex >= 0 && segmentIndex < storySegments.length) {
            currentSegment = segmentIndex;
           testingDescription(storySegments[segmentIndex]);
        } else {
            storyTextArea.setText("End of story or invalid path.");
        }
    }
}
