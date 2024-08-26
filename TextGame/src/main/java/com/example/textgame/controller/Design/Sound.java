package com.example.textgame.controller.Design;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.net.URL;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.net.URL;

public class Sound {

    private static MediaPlayer mediaPlayer;

    public static void clickButton() {
        playSound("buttonSd.mp3");
    }
    public static void typingSound() {
        playSound("typing.mp3");
    }
    public static void playBackgroundMusic() {
        playLoopingSound("creepytown.mp3");
    }

    private static void playSound(String filename) {
        URL resource = Sound.class.getResource("/com/example/textgame/" + filename);
        Media sound = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    }
    private static void playLoopingSound(String filename) {
        URL resource = Sound.class.getResource("/com/example/textgame/" + filename);
        Media sound = new Media(resource.toString());
        mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE); // Loop indefinitely
        mediaPlayer.play();
    }
    public static void stopLoopingMusic() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }
}