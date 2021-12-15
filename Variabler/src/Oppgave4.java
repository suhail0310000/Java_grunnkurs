import javax.swing.*;

public class Oppgave4 {
    public static void main(String [] args){
        String forNavn = JOptionPane.showInputDialog("Skriv inn fornavn:");
        String etterNavn = JOptionPane.showInputDialog("Skriv inn etternavn:");
        String adresse = JOptionPane.showInputDialog("Skriv inn adresse:");
        String poststed = JOptionPane.showInputDialog("Skriv inn poststed:");
        String postNr = JOptionPane.showInputDialog("Skriv inn postnr:");
        int alder = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn alder"));
        String fullNavn = forNavn+" "+etterNavn;
        String formuler = "Navn: "+fullNavn+"\nAdresse: "+adresse+"\nPostnummer: "+postNr+"\nPoststed: "+poststed+"\nAlder: "+alder;
        JOptionPane.showMessageDialog(null,formuler);
    }
}
