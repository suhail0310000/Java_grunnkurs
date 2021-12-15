import javax.swing.*;

public class Oppgave2 {
    public static void main(String[] args){
        int innAlder = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn alderen din: "));
        if(innAlder >= 18){
            System.out.print("Du kan ta førerkortet for bil da du er gammel nok");
        }
        if(innAlder <18){
            System.out.print("Du er for ung til å ta førerkort for bil");
        }
    }
}
