package com.example.textgame.controller;

import com.example.textgame.LoadRoom;
import com.example.textgame.controller.Design.Sound;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.HashMap;


/**
 * @author cwatson
 * @createdOn 8/7/2024 at 6:33 PM
 * @projectName TextGame
 * @packageName PACKAGE_NAME;
 */


public class GuiController {
    @FXML
    Label Entry1, Entry2, Entry3, description, roomName;

    //when you want to pass text through the description, you can use TextManipulation

    @FXML
    private void initialize() {
        setUp(new LoadRoom().frontDoor());
    }

    public void setUp(HashMap create){
        roomName.setText("Current Room: " + (String) create.get("Name"));
        description.setText((String) create.get("Description"));
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

