package com.example.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.media.MediaView;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MediaView media;

    @FXML
    void initialize() {
        assert media != null : "fx:id=\"media\" was not injected: check your FXML file 'z.fxml'.";

    }

}
