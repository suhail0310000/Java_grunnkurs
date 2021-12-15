package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField inpEtternavn;

    @FXML
    private TextField inpFornavn;

    @FXML
    private Label lblUt;

    @FXML
    void btnNavn(ActionEvent event) {
        String ut = inpFornavn.getText();
        ut += inpEtternavn.getText();
        lblUt.setText(ut);
    }

}

