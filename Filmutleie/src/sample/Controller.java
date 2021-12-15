package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    FilmUtleie film = new FilmUtleie();

    @FXML
    private TextField inpFilm;

    @FXML
    private TextField inpKundeNavn;

    @FXML
    private TextField inpTlf;

    @FXML
    private Label lblUt;

    @FXML
    void btnLeiut(ActionEvent event) {
        String filmInp = inpFilm.getText();
        String navnInp = inpKundeNavn.getText();
        String tlfInp = inpTlf.getText();
        lblUt.setText(film.leiUt(navnInp,tlfInp,filmInp));

        //String utLbl = inpFilm.getText();
    }

    @FXML
    void btnLeverInn(ActionEvent event) {

    }

    @FXML
    void btnUtleie(ActionEvent event) {

    }

}
