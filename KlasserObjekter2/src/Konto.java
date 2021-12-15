import javax.swing.*;

public class Konto {
    //  Attributtene for kontoinnehavers navn, kontornummer og saldo.
    public String navn;
    public String kontonr;
    public double saldo;
    //  Kontruktør som skal gi startverdier til ALLE attributtene
    public Konto(String navn, String kontonr, double saldo){
        this.navn = navn;
        this.kontonr = kontonr;
        this.saldo = saldo;
    }
    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
       navn, kontonummer og saldo i et dialogvindu. */
    void kontoUtskrift(){
        JOptionPane.showMessageDialog(null,"Navn: "+navn+"\nKontonr: "+kontonr+"\nSaldo: "+saldo);
    }

    /*  Metode som setter inn et beløp på kontoen.
        Beløpets størrelse skal tas imot via en parameter til metoden.
        Metoden skal returnere en tekst som inneholder informasjon om
        den nye saldoen.  */
    public void settInnBeløp(double innBeløp){
        double totalSaldo = innBeløp + saldo;
        String ut = "Du har satt inn: "+innBeløp+". Du har nå: "+totalSaldo+" på kontoen.";
        System.out.print(ut);
    }

    /*  Metode som tar ut et beløp fra kontoen, under forutsetning av
        at det er dekning for beløpet.
        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
        Hvis det er dekning på kontoen, skal metoden returnere en tekst
        med informasjon om den nye saldoen. Hvis  det ikke er dekning,
        skal den returnerte teksten inneholde informasjon om det. */
    public void taUtBeløp(double utBeløp){
        double totalSaldo = saldo - utBeløp;
        if(totalSaldo<0){
            System.out.print("Ikke mulig å ta ut penger");
        }else{
            String ut = "Du har tatt ut: "+utBeløp+". Du har nå: "+totalSaldo+" på kontoen.";
            System.out.print(ut);
        }
    }


    public static void main(String[] args){
        String innNavn = JOptionPane.showInputDialog("Skriv inn navn:");
        String innKonto = JOptionPane.showInputDialog("Skriv inn kontonr:");
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn saldo:"));
        Konto enKonto = new Konto(innNavn,innKonto,saldo);
        enKonto.settInnBeløp(100);
        enKonto.taUtBeløp(100);

         /*  Opprett et Konto-objekter, som ved opprettelsen blir tilført
        navn, kontonummer og saldo. */

    /*  Test ut ALLE metodene du har laget i Konto-klassen på
        Konto-objektene. Skriv resultatene av metodene ut på System.out.
        Bruk dialogvinduer til både innlesing og utskrift av kontoinformasjon */
    }
}
