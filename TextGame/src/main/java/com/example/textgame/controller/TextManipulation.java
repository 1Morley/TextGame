package com.example.textgame.controller;

import com.example.textgame.controller.Design.Sound;
import javafx.animation.PauseTransition;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class TextManipulation {
    private static final int MAX_CHAR_PER_LINE = 54;
    private static PauseTransition pauseTransition;
    private static String fullText;

    public static String wrapText(String text) {
        //https://stackoverflow.com/questions/47342679/how-to-fill-text-vertically-in-javafx reference to what I was trying
        //to do if you can get it to work the right way that would be great
        StringBuilder wrappedText = new StringBuilder();
        int lineLength = 0;

        for (String word : text.split(" ")) {
            if (lineLength + word.length() > MAX_CHAR_PER_LINE) {
                wrappedText.append("\n");
                lineLength = 0;
            }
            wrappedText.append(word).append(" ");
            lineLength += word.length() + 1;
        }

        return wrappedText.toString().trim();
    }

    public static void typeText(String text, Label label) {
        fullText = wrapText(text);
        label.setText("");
        char[] characters = fullText.toCharArray();
        StringBuilder currentText = new StringBuilder();

        pauseTransition = new PauseTransition(Duration.millis(50));

        pauseTransition.setOnFinished(event -> {
            if (currentText.length() < characters.length) {
                currentText.append(characters[currentText.length()]);
                label.setText(currentText.toString());
                Sound.typingSound();
                pauseTransition.playFromStart();
            }
        });

        pauseTransition.play();
    }
    public static void stopTypingAndShowFullText(Label label) {
        if (pauseTransition != null) {
            pauseTransition.stop();
        }
        label.setText(fullText);
    }

}