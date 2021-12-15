import javax.swing.*;

public class Oppgave1 {
    public static void main(String [] args){
        String forNavn = JOptionPane.showInputDialog("Skriv inn fornavnet ditt:");
        String etterNavn = JOptionPane.showInputDialog("Skriv inn etternavnet ditt:");
        String fullNavn = forNavn + " " + etterNavn;
        JOptionPane.showMessageDialog(null,fullNavn);
        //System.out.print(forNavn + " " + etterNavn);



    }
}
