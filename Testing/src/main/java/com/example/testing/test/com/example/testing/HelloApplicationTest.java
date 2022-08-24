package com.example.testing;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DialogPane;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;

import static org.junit.Assert.*;

public class HelloApplicationTest extends ApplicationTest {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        stage.setTitle("Form Test!");
        stage.setScene(scene);
        stage.show();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        FxToolkit.hideStage();
        release(new KeyCode[]{});
        release(new MouseButton[]{});
    }

    @Test
    public void testClick1() {
        clickOn("#txtNrp").write("2072051");
        clickOn("#txtNama").write("Nisa Deviani");
        clickOn("#txtNilai").write("70");
        Node alert = lookup(".dialog-pane").query();
        DialogPane pane = (DialogPane) alert;
        Assertions.assertThat(pane).isVisible();
        Assertions.assertThat(pane.getContentText()).hasToString("Success");
    }

    public void testClick2() {
        clickOn("#txtNrp").write("2072051");
        clickOn("#txtNama").write("Nisa Deviani");
        clickOn("#txtNilai").write("70");
        Node alert = lookup(".dialog-pane").query();
        DialogPane pane = (DialogPane) alert;
        Assertions.assertThat(pane).isVisible();
        Assertions.assertThat(pane.getContentText()).hasToString("Invalid");
    }
}