package com.example.textgame.controller;

import com.example.textgame.LoadRoom;
import com.example.textgame.controller.Design.EndingStage;
import com.example.textgame.controller.Design.Sound;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;


/**
 * @author cwatson
 * @createdOn 8/7/2024 at 6:33 PM
 * @projectName TextGame
 * @packageName PACKAGE_NAME;
 */


public class GuiController {
    private static Stage stage;
    @FXML
    Label Entry1, Entry2, Entry3, description, roomName;

    //when you want to pass text through the description, you can use TextManipulation

    HashMap hashMap = new HashMap();
    @FXML
    private void initialize() {
        setUp(new LoadRoom().frontDoor());
        //HideText();
        //showDescription();
    }

    @FXML
    private void moveUp(){
        //UpstairsBtn
        Sound.clickButton();
        setUp(new LoadRoom().upstairs());
    }
    @FXML
    private void moveAhead(){
        //moveAheadBtn
        Sound.clickButton();
        setUp(new LoadRoom().mainFloor());
    }
    @FXML
    private void moveDown(){
        //BasementBtn
        Sound.clickButton();
        setUp(new LoadRoom().basement());
    }

    public void setUp(HashMap create){
        roomName.setText("Current Room: " + (String) create.get("Name"));
        description.setText((String) create.get("Description"));
    }
    public void HideText(){
        Entry1.setVisible(false);
        Entry2.setVisible(false);
        Entry3.setVisible(false);
    }
    public void ShowText(){
        Entry1.setVisible(true);
        Entry2.setVisible(true);
        Entry3.setVisible(true);
    }
    public void HideDescription(){
        description.setVisible(false);
    }
    public void showDescription(){
        description.setVisible(true);
    }

    public Label getDescriptionLabel(){
        return description;
    }

    private void endingGame(String endingText) {
        Scene scene;
        Stage stage = (Stage) description.getScene().getWindow();
        if (stage == null) {
            System.out.println("Stage is null.");
            return;
        }
        FXMLLoader fxmlLoader = null;
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
        end.endingScript(endingText);
    }


    //Button Controls
    @FXML public void testingDescription(){
        TextManipulation.typeText("Welcome to the Text Game! If you'd like to skip the texting animation just press the red x button", description);
    }
    @FXML public void stopTxtAnimation(){
        TextManipulation.stopTypingAndShowFullText(description);
    }
    @FXML protected void onTyping(){
        Sound.typingSound();
    }
    @FXML protected void choice1(){
        Sound.clickButton();
    }
    @FXML protected void choice2(){
        Sound.clickButton();
    }


}

