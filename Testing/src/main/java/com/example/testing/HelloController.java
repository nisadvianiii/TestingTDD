package com.example.testing;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button btnSubmit;
    @FXML
    private TextField txtNrp;
    @FXML
    private TextField txtNama;
    @FXML
    private TextField txtNilai;

    private DataDaoImpl dataDao;
    @FXML
    public void onSubmit(ActionEvent actionEvent) {
        String nrp = txtNrp.getText();
        String nama = txtNama.getText();
        String nilai = txtNilai.getText();
        if (dataDao.submit(nrp,nama,nilai)){
            ViewUtil.alert(Alert.AlertType.INFORMATION,"Data Submitted").showAndWait();
        } else {
            ViewUtil.alert(Alert.AlertType.ERROR, "Invalid Submit Data").showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        dataDao = new DataDaoImpl();
    }
}