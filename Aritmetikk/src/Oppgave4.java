import javax.swing.*;

public class Oppgave4 {
    public static void main(String[] args){
        double innRad = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn lengde:"));
        double formelOmkrets = 2*3.14*innRad;
        String omkretsenMedToDesimaler = String.format("%.2f" , formelOmkrets);
        System.out.print("Omkretsen av en sirkel med "+ innRad+" cm som radius blir "+omkretsenMedToDesimaler+" cm");
    }
}
