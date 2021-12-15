import javax.swing.*;

public class Klokke {
    private int timer;
    private int minutter;
    private int sekunder;

    public Klokke(int time, int minutt, int sekund){
        setTime(time);
        setMinutter(minutt);
        setSekund(sekund);
    }

    public int getTime(){
        return timer;
    }

    public void setTime(int time){
        if(time >= 0 && time <= 24){
            this.timer = time;
        }
    }

    public int getMinutter(){
        return minutter;
    }

    public void setMinutter(int minutt){
        if(minutt > 0 && minutt <= 59){
            this.minutter = minutter;
        }
    }

    public int getSekunder(){
        return sekunder;
    }

    public void setSekund(int sekund){
        if(sekund > 0 && sekund <= 59){
            this.sekunder = sekunder;
        }
    }

    public void tid(){
        String tid = timer+" : "+minutter+" : "+sekunder;
        System.out.print(tid);
    }

    public static void main(String[] args){
        int innTime = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn time: "));
        int innMinutt = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn minutter: "));
        int innSekund = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn sekunder: "));
        Klokke enKlokke = new Klokke(innTime,innMinutt,innSekund);
        enKlokke.tid();

    }
}
