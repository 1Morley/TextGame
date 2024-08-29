package com.example.textgame.controller.Design;

import javafx.animation.PauseTransition;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.net.URL;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Sound {

    private static MediaPlayer mediaPlayer;
    private static MediaPlayer typingMediaPlayer;
    private static PauseTransition pauseTransition;
    private static boolean isMuted = false;

    public static void typingSound() {
        if (typingMediaPlayer == null) {
            URL resource = Sound.class.getResource("/com/example/textgame/typing.mp3");
            Media sound = new Media(resource.toString());
            typingMediaPlayer = new MediaPlayer(sound);
        }
        if (isMuted) {
            typingMediaPlayer.setVolume(0);
        }

        if (pauseTransition == null) {
            pauseTransition = new PauseTransition(Duration.seconds(0.5));
            pauseTransition.setOnFinished(event -> stopTypingSound());
        }

        if (typingMediaPlayer.getStatus() != MediaPlayer.Status.PLAYING) {
            typingMediaPlayer.play();
        }

        pauseTransition.playFromStart();
    }
    public static void clickButton() {
        playSound("buttonSd.mp3");
    }
    public static void playBackgroundMusic() {
        playLoopingSound("creepytown.mp3");
        //https://soundimage.org/horror-2/ if you want to change the music
    }

    private static void playSound(String filename) {
        URL resource = Sound.class.getResource("/com/example/textgame/" + filename);
        Media sound = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
    } //might remove because only one method uses it currently and it doesn't remove redundancy
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
    private static void stopTypingSound() {
        if (typingMediaPlayer != null && typingMediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
            typingMediaPlayer.stop();
        }
    }
    public static void stopAllSounds() {
        if (mediaPlayer != null && mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
            mediaPlayer.stop();
        }

        if (typingMediaPlayer != null && typingMediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
            typingMediaPlayer.stop();
        }

        if (pauseTransition != null) {
            pauseTransition.stop();
        }
    }
    public static void mute() {
        isMuted = true;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(0);
        }
    }

}