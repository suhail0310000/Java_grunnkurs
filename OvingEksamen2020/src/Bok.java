public class Bok {
    private String tittel;
    private Forfatter forfatter;

    public Bok(String tittel, Forfatter forfatter){
        this.tittel = tittel;
        this.forfatter = forfatter;
    }

    public String getTittel(){
        return this.tittel;
    }

    public void setTittel(String tittel){
        this.tittel = tittel;
    }

    public Forfatter getForfatter(){
        return this.forfatter;
    }

    public void setForfatter(Forfatter forfatter){
        this.forfatter = forfatter;
    }

    public String toString(){
        String ut ="Tittel: "+getTittel()+" Forfater: "+getForfatter();
        return ut;
    }

    public static void main(String[] args){
        Forfatter enForfatter = new Forfatter("Suhail","03.10.2000");
        Bok enBok = new Bok("bok1",enForfatter);
        Bok toBok = new Bok("bok2",enForfatter);
        System.out.println(enBok.toString());
        System.out.println(toBok.toString());


    }
}
