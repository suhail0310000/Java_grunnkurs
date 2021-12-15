import javax.swing.*;

public class Oppgave3 {
    public static void main(String[] args){
        try{
            double innLengde = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn lengde:"));
            double innBredde = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn bredde:"));
            double res = innLengde * innBredde;
            System.out.print("Et rektangel med bredde: "+innBredde+"cm og lengde "+innLengde+"cm har et areal på "+res+" cm^2");
        }catch(Exception e){
            System.out.print("Alle inputs på være tall");
        }
    }
}
