package com.example.textgame.controller;

import com.example.textgame.LoadData;
import com.example.textgame.LoadRoom;
import com.example.textgame.controller.Design.Sound;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
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
    ArrayList<HashMap> currentRoom =  new ArrayList<>();
    HashMap hashMap = new HashMap();
    @FXML
    private void initialize() {
        LoadData data = new LoadData();
        hashMap = data.Data(new File("check.txt"));
        setUp(new LoadRoom().room());
        HideText();
        showDescription();
    }

    @FXML
    private void move(){
        setUp(new LoadRoom().House());
    }
    public void setUp(HashMap create){
        roomName.setText((String) create.get("Name"));
        description.setText((String) create.get("Description"));
        //can also put image and items in here too
    }


    public void buttonClick(){

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
