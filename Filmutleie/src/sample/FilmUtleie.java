package sample;

import java.util.ArrayList;

public class FilmUtleie {
    // instansier arrayet her
    ArrayList<Film> filmutleie = new ArrayList<>();

    public FilmUtleie() {
        /*Person person1 = new Person("Suhail","123456789");
        Person person2 = new Person("tester","987654321");*/
        Film enFilm = new Film("Harry",100,null);
        Film toFilm = new Film("Harry",100,null);
        filmutleie.add(enFilm);
        filmutleie.add(toFilm);
        // legg inn filmene som skal være til utleie her
        // to filmer holder
    }

    public String leiUt(String navn, String telefonnr, String tittel){
        Person enPerson = new Person(navn,telefonnr);
        for(Film enFilm : filmutleie){
            if(enFilm.leidAv.equals(null) && enFilm.tittel.equals(tittel) ){
                return "Film finnes og er ikke leid av noen";
            }
            else if(enFilm.leidAv.equals(enPerson) && enFilm.tittel.equals(null)){
                return "Film finnes, men er leid av "+enPerson.navn;
            }
        }
        return "film finnes ikke";
        // sjekk om filmen finnes og at den ikke er leid ut (at leidAv er null)
        // returner meldinger om det var vellykket utleie
        // om ikke filmen fantes
        // eller om filmen fantes men den var utleid
    }

    public String leverInn(String tittel){
        for(Film enFilm : filmutleie){
            if(enFilm.leidAv.equals(true) && enFilm.tittel.equals(tittel) ){
                return "Film er levert inn og er funnet i systemet";
            }
        }
        return "film finnes ikke og er ikke utleid";
        // sjekk om filmen finnes og at den er utleid (at det er et personobjekt på leidAv)
        // dersom dette nullstill person-pekeren i filmen og returner at den ble levert
        // returner feilmelding dersom filmen ikke finnes
        // returner også feilmelding dersom filmen finnes med ikke er utleid

    }

    @Override
    public String toString(){
        // løp igjennom hele registrert og formater
        String ut="";
        // løp igjennom hele registrert og formater
        for (Film enFilm : filmutleie){
            ut +="Tittel : "+enFilm.tittel+". Pris "+enFilm.utLeiePris+" kr \n";
            if(enFilm.leidAv!=null){
                ut+="er utleid til "+enFilm.leidAv.navn+" "+enFilm.leidAv.telefonnr+"\n";
            }
            else{
                ut+= "er ikke utleid\n";
            }
            ut+="---------------\n";
        }
        return ut;
    }
}
