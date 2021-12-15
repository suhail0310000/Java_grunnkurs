package sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bil {
    public String bilNummer;
    public Date startTid;
    public int plass;
    public boolean kortTid; // true = korttids parkering
    /*Date nå = new Date();
    long varighet = nå.getTime() - startTid.getTime();
    long time = varighet/3600000;*/

    public Bil(String bilNummer, Date startTid, boolean kortTid) {
        this.bilNummer = bilNummer;
        this.startTid = startTid;
        this.kortTid = kortTid;
    }

    public String formaterKvittering(){
        String startDatoTid = new SimpleDateFormat("dd.MM.YYYY HH:mm").format(startTid);
        String nå = new SimpleDateFormat("dd.MM.YYYY HH:mm").format(new Date());
        String ut = "Kvittering for bilnr "+bilNummer+"\n";
        ut+="Start tid :"+startDatoTid+" til "+nå+"\n"+"Betalt "+avgift()+" kr";
        return ut;
    }

    public double getPris(){
        if(this.kortTid){
            return 20.0;
        }
        else{
            return 10.00;
        }
        // returner 10 eller 20 kroner avhengig av kortTid eller ikke
    }
    public double avgift(){
        Date nå = new Date();
        long varighet = nå.getTime() - startTid.getTime();
        // riktig antall millisekunder i en time er 3_600_000
        int timer = (int)varighet/10_000; // gir mulighet for å teste (10 sekunder)
        double pris = timer * getPris();
        return pris;
    }
}
