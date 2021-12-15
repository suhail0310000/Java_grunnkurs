import java.util.ArrayList;

public class Bok {
    private String tittel;
    private String forfatter;
    private double pris;

    public Bok(String tittel, String forfatter, double pris){
        this.tittel = tittel;
        this.forfatter = forfatter;
        this.pris = pris;
    }

    public String toString(){
        String ut = "";
        ut += "Tittel: "+tittel+"\nForfatter: "+forfatter+"\nPris: "+pris+"\n";
        return ut;
    }

    public static void main(String[] args){
        ArrayList<Bok> bøker = new ArrayList<>();
        Papirbok bok1 = new Papirbok("bok1","suhai",100,123456778);
        Lydbok bok2 = new Lydbok("bok1","suhai",100,123456778);
        bøker.add(bok1);
        bøker.add(bok2);
        for(Bok enBok : bøker){
            System.out.println(enBok.toString());
        }
    }
}
