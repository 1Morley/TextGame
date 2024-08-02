module com.example.textgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.textgame to javafx.fxml;
    exports com.example.textgame;
}