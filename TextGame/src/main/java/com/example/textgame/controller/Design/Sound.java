package com.example.textgame.controller.Design;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.net.URL;

public class Sound {

    public static void clickButton() {
        playSound("buttonSd.mp3");
    }
    private static void playSound(String filename) {
        URL resource = Sound.class.getResource("/org/example/textgame/" + filename);
        Media sound = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }
}
