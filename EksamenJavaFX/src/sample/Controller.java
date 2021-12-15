package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    int[] pris = {36,59,82,105,128};
    @FXML
    private CheckBox chkRabatt;

    @FXML
    private Label lblFeilAntall;

    @FXML
    private Label lblFeilSoner;

    @FXML
    private Label lblResultat;

    @FXML
    private TextField txtAntall;

    @FXML
    private TextField txtSoner;

    @FXML
    void btnBeregn(ActionEvent event) {
        int getAntall = Integer.parseInt(txtAntall.getText());
        int getSoner = Integer.parseInt(txtSoner.getText());
        double totalPris = 0;
        boolean sjekk = chkRabatt.isSelected();
        if(getAntall <= 0){
            lblFeilAntall.setText("Antall kan ikke være minus eller 0");
        }
        if(getSoner <= 0 || getAntall > 5){
            lblFeilSoner.setText("Antall må være mellom 1 og 5");
        }
        for(int i = 0; i<pris.length; i++){
            if(sjekk == false){
               totalPris = pris[getSoner] * getAntall;
            }
            totalPris = getSoner*getAntall;
        }
        lblResultat.setText(totalPris);


    }

}

