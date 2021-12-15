import javax.swing.*;

public class Oppgave3 {
    public static void main(String [] args){
        String forNavn = JOptionPane.showInputDialog("Skriv inn fornavn:");
        String etterNavn = JOptionPane.showInputDialog("Skriv inn etternavn:");
        String adresse = JOptionPane.showInputDialog("Skriv inn adresse:");
        String poststed = JOptionPane.showInputDialog("Skriv inn poststed:");
        String postNr = JOptionPane.showInputDialog("Skriv inn postnr:");
        int alder = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn alder"));
        String fullNavn = forNavn+" "+etterNavn;
        JOptionPane.showMessageDialog(null,fullNavn+" bor i "+adresse+" som har postnummer "+postNr+" i "+poststed+" "+forNavn+" alder er "+alder);


    }
}
