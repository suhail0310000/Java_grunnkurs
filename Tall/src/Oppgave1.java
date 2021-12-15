import javax.swing.*;

public class Oppgave1 {
    public static void main(String[] args){
        int innAlder = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn alder"));
        String ut = "Min alder er "+innAlder;
        JOptionPane.showMessageDialog(null,ut);
    }
}
