package sample;

import java.util.Random;

public class KodeGenerator {
    private int[] kodeArray;
    private Random r = new Random();
    private int nyKodeIndeks = 0;

    public KodeGenerator( int antall ) {
        kodeArray = new int[antall];
        genererKoder();
    }

    private void genererKoder() {
        /*
        Fyller  kodeArray med tilfeldige, 6-sifrede tall.
        NB! Det laveste mulige tallet skal være 100000, og det høyeste 999999.
         */
        for( int i = 0; i < kodeArray.length; i++) {
            kodeArray[i] = 100000 + r.nextInt(900000);
        }
    }

    public String nyKode(int maksAntall) {
        // returnerer ny kode fra arrayet eller en feilmelding ved array-slutt
        if(nyKodeIndeks<maksAntall){
            return Integer.toString(kodeArray[nyKodeIndeks++]);
        }
        return "Maks antall!";
    }

    public String formaterBrukteKoder() {
        // løp igjennom arrayet og formater kodene med \n i mellom
        // kodene fra og med 0 til nyKodeIndeks er "brukte" koder
        String ut="";
        for( int i = 0; i < nyKodeIndeks; i++) {
            ut+=kodeArray[i]+"\n";
        }
        return ut;
    }
}
