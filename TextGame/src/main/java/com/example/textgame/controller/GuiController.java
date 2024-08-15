package com.example.textgame.controller;

import com.example.textgame.controller.Design.Sound;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * @author cwatson
 * @createdOn 8/7/2024 at 6:33 PM
 * @projectName TextGame
 * @packageName PACKAGE_NAME;
 */

public class GuiController {


@FXML protected void buttonClick(){
    System.out.println("I was clicked!");
    new Sound().clickButton(); //Testing
}
}
