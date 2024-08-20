module com.example.textgame {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.textgame to javafx.fxml;
    exports com.example.textgame;
    exports com.example.textgame.controller;
    opens com.example.textgame.controller to javafx.fxml;
}