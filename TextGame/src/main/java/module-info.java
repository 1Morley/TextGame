module com.example.textgame {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.textgame to javafx.fxml;
    opens com.example.textgame.controller to javafx.fxml;
    opens com.example.textgame.controller.Design to javafx.fxml;

    exports com.example.textgame;
    exports com.example.textgame.controller;
    exports com.example.textgame.controller.Design;
}
