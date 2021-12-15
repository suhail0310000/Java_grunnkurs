import javax.swing.*;

public class Boker {
    String tittel;
    double pris;
    String forfatter;
    String iSBNnummer;
    public void skrivUt(){
        tittel = JOptionPane.showInputDialog("SKriv inn i tittel:");
        pris = Double.parseDouble(JOptionPane.showInputDialog("SKriv inn i pris:"));
        forfatter = JOptionPane.showInputDialog("SKriv inn i forfatter:");
        iSBNnummer = JOptionPane.showInputDialog("SKriv inn i ISBN:");
        System.out.print("Tittel: "+tittel+"\n");
        System.out.print("Pris: "+pris+"\n");
        System.out.print("Forfatter: "+forfatter+"\n");
        System.out.print("ISBN-nummer: "+iSBNnummer+"\n");
    }
    public static void main(String [] args){
        Boker enBok = new Boker();
        enBok.skrivUt();
    }
}
