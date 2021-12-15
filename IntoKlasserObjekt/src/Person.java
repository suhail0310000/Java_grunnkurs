import javax.swing.*;

public class Person {
    String navn;
    String adresse;
    String telefonnr;
    int fødselsår;
    public int regnAlder(){
        int alder = 2021 - fødselsår;
        return alder;
    }
    public void skrivUt(int innAlder){
        System.out.print(navn+" med adresse "+adresse+" med telefonnummer "+ telefonnr+" er "+ innAlder);
    }

    public static void main(String[] args){
        String innNavn = JOptionPane.showInputDialog("Skriv inn navn: ");
        String innAdresse = JOptionPane.showInputDialog("Skriv inn adresse: ");
        String innTlf = JOptionPane.showInputDialog("Skriv inn tlf: ");
        int innFødsel = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn fødselsår: "));
        Person enPerson = new Person();
        enPerson.navn = innNavn;
        enPerson.adresse = innAdresse;
        enPerson.telefonnr = innTlf;
        enPerson.fødselsår = innFødsel;
        int alder = enPerson.regnAlder();
        enPerson.skrivUt(alder);
    }
}
