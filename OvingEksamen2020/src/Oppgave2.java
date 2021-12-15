import javax.swing.*;

public class Oppgave2 {
    public static double tilCelsius(double Fahernheit) {
        double C = (Fahernheit - 32) / 1.8;
        return C;
    }

    public static double tilFahrenheiht(double Celsius) {
        double F = Celsius * 1.8 + 32;
        return F;
    }
    public static void main(String[] args){
        double innC = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn C grader"));
        double innF = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn F grader"));
        System.out.println(tilCelsius(innF));
        System.out.println(tilFahrenheiht(innC));
    }
}
