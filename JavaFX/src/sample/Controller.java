package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label lblUt;

    @FXML
    void TrykkMeg(ActionEvent event) {
        lblUt.setText("Ut");
    }

}
