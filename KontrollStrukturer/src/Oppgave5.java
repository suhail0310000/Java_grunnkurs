import javax.swing.*;

public class Oppgave5 {
    public static void main(String[] args){
        String innMåned = JOptionPane.showInputDialog("Skriv inn måned:");
        if(innMåned.equals("januar") || innMåned.equals("februar") || innMåned.equals("desember")){
            System.out.print("Det er vinter");
        }
        else if(innMåned.equals("mars") || innMåned.equals("april") || innMåned.equals("mai")){
            System.out.print("Det er vår");
        }
        else if(innMåned.equals("juni") || innMåned.equals("juli") || innMåned.equals("august")){
            System.out.print("Det er sommer");
        }
        else{
            System.out.print("høst");
        }
    }
}
