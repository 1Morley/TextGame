package com.example.textgame.controller.Design;

import com.example.textgame.controller.TextManipulation;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class EndingStage {
    @FXML Label endingDescription;


    public void endingScript(String script) {
        String endingScript = TextManipulation.wrapText(script);
        Sound.mute();
        this.endingDescription.setText(endingScript);
        System.out.println(endingDescription.getText());
    }
}
