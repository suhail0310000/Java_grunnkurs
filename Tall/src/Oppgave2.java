import javax.swing.*;

public class Oppgave2 {
    public static void main(String[] args){
        double innTall1 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn første desimaltall:"));
        double innTall2 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn andre desimaltall:"));
        double innTall3 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn tredje desimaltall:"));
        double ut = innTall1+innTall2+innTall3;
        System.out.print("Summen av alle tallene er: "+ut);
    }
}
