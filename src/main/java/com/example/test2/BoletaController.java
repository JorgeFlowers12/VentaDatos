package com.example.test2;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class BoletaController {

    @FXML private TextArea txtBoleta;

    public void setTextoBoleta(String texto) {
        txtBoleta.setText(texto);
    }

    @FXML
    private void volverAlMenu() {
        // Cerrar solo esta ventana
        Stage stage = (Stage) txtBoleta.getScene().getWindow();
        stage.close();
    }
}
