import javax.swing.*;

public class Oppgave1 {
    public static void main(String[] args){
        String innNavn = JOptionPane.showInputDialog("Skriv inn navn");
        int innAlder = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn alder:"));
        int fødselsdato = 2021-innAlder;
        int pensjonsDato = 2021+innAlder;
        int fremtidigAlder = pensjonsDato-fødselsdato;
        System.out.print(innNavn+" er idag "+innAlder+"år.\nHan er født i "+fødselsdato+". I "+pensjonsDato+" er han "+fremtidigAlder+" og da vil han være pensjonist");
    }
}
