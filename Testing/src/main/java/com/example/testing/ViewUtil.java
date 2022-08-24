package com.example.testing;

import javafx.scene.control.Alert;

public class ViewUtil {
    public static Alert alert(Alert.AlertType type, String content) {
        Alert a = new Alert(type);
        a.setContentText(content);
        return a;
    }
}
