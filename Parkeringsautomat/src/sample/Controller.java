package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Date;

public class Controller {

    Parkeringshus pHus = new Parkeringshus();


    @FXML
    private TextField inpSkilt;

    @FXML
    private Label lblUt;

    @FXML
    void btnKjør(ActionEvent event) {
        String melding = pHus.frigjørPlass(inpSkilt.getText());
        lblUt.setText(melding);
    }

    @FXML
    void btnKorttid(ActionEvent event) {
        // opprett en bil
        Date nå = new Date();
        Bil enBil = new Bil(inpSkilt.getText(),nå,true);
        pHus.reserverPlass(enBil);
    }

    @FXML
    void btnLangtid(ActionEvent event) {
        // opprett en bil
        Date nå = new Date();
        Bil enBil = new Bil(inpSkilt.getText(),nå,false);
        pHus.reserverPlass(enBil);
    }

}

