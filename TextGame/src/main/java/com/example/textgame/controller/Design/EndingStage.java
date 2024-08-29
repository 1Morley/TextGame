package com.example.textgame.controller.Design;

import com.example.textgame.controller.TextManipulation;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class EndingStage {
    @FXML Label endingDescription;


    public void endingScript(String script) {
        TextManipulation.typeText(script, endingDescription);
    }
}
