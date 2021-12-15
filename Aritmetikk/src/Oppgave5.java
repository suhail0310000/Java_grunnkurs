import javax.swing.*;

public class Oppgave5 {
    public static void main(String[] args){
        double innFah = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn fahrenheit:"));
        double regnUtC = (innFah-32)/1.8;
        System.out.print("Celciusgrader: "+regnUtC);
    }
}
