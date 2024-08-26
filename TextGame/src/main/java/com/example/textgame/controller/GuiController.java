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

    @FXML protected void onTyping(){
        Sound.typingSound();
    }
    @FXML protected void choice1(){
        Sound.clickButton();
    }
    @FXML protected void choice2(){
        Sound.clickButton();
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



}

