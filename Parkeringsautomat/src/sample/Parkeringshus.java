package sample;

import java.util.ArrayList;

public class Parkeringshus {
    // opprett arrayet av biler
    ArrayList<Bil> parkering = new ArrayList<>();

    public void reserverPlass(Bil enBil){
        // legg bilen i arrayet
        parkering.add(enBil);
    }

    public String frigjørPlass(String bilNummeret){
        for(Bil enBil : parkering){
            if(enBil.bilNummer.equals(bilNummeret)){
                parkering.remove(enBil);
                return enBil.formaterKvittering();
            }
        }
        String ut = "Fant ikke bilen";
        return ut;
        /*

         ** må finne bilen i arrayet
         ** når den er funnet slett den fra arrayet
         ** og formater kvitteringen som returneres
         ** dersom bilen ikke finnes skal man returnere en passenede tekst
         */
    }
}
