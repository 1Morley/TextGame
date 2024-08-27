/**
 * @author cwatson
 * @createdOn 8/12/2024 at 11:08 PM
 * @projectName TextGame
 * @packageName com.example.textgame.controller;
 */
package com.example.textgame;

import com.example.textgame.controller.Design.Sound;
import com.example.textgame.controller.GuiController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("bookui.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 900);
        stage.setTitle("Text Game");
        stage.setScene(scene);
        Sound.playBackgroundMusic();
        stage.setOnCloseRequest((WindowEvent event) -> {
            Sound.stopLoopingMusic();
            Platform.exit();
            System.exit(0);
        });
        stage.show();
        GuiController controller = fxmlLoader.getController();
        controller.testingDescription();
    }

    public static void main(String[] args) {
        launch();
    }

}
