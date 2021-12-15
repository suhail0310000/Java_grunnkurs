import javax.swing.*;

public class Kalkulator {
    static double adder(double tall1, double tall2){
        double sum = tall1 + tall2;
        return sum;
    }
    static double sub(double tall1, double tall2){
        double sum = tall1 - tall2;
        return sum;
    }
    static double multi(double tall1, double tall2){
        double sum = tall1 * tall2;
        return sum;
    }
    static double div(double tall1, double tall2){
        double sum = tall1 / tall2;
        return sum;
    }
    public static void main(String[] args){
        int tall1 = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn tall1:"));
        int tall2 = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn tall2:"));
        System.out.print(adder(tall1,tall2));
    }
}
