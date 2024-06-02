package controller;

import javafx.fxml.FXML;

import java.io.IOException;

public class HelloController {

    @FXML
    private void initialize() {

    }

    @FXML
    public void startQuiz() throws IOException {
        App.setRoot("quiz");
    }
}
