import javax.swing.*;

public class Oppgave2 {
    public static void main(String[] args){
        String forNavn = JOptionPane.showInputDialog("Skriv inn fornavnet ditt:");
        String etterNavn = JOptionPane.showInputDialog("Skriv inn etternavnet ditt:");
        String fullNavn = forNavn + " " + etterNavn;
        JOptionPane.showMessageDialog(null,"Alderen til "+fullNavn+" er 21 år");
    }
}
