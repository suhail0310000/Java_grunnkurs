import javax.swing.*;

public class Oppgave10 {
    public static void main(String[] args){
        try {
            int innAlder = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn alder:"));
            if(innAlder >= 18){
                System.out.print("Du kan ta førerkortet for bil da du er gammel nok");
            }else{
                System.out.print("Du er for ung til å ta førerkort for bil");
            }
        }catch(Exception e){
            System.out.print("må skrie inn helt tall");
        }

    }
}
