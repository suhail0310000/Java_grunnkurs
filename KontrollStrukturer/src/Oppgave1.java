import javax.swing.*;

public class Oppgave1 {
    public static void main(String[] args){
        int innAlder = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn alderen din: "));
        if(innAlder > 18 && innAlder < 20){
            System.out.print("Du er myndig men kan ikke kjøpe alkohol med mer enn 22 % på polet");
        }else{
            System.out.print("Du er enten umyndig eller så kan du kjøpe hva du vil på polet");
        }
    }
}
