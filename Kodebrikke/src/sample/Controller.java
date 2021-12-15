package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    // husk denne!
    public final int MAKS_ANTALL=10;
    private KodeGenerator generator = new KodeGenerator(MAKS_ANTALL);

    @FXML
    private Label lblGamleKoder;

    @FXML
    private Label lblNykode;

    @FXML
    void btnGammelKoder(ActionEvent event) {
        lblGamleKoder.setText(generator.formaterBrukteKoder());
    }

    @FXML
    void btnNyKoder(ActionEvent event) {
        lblNykode.setText(generator.nyKode(MAKS_ANTALL));

    }

}
