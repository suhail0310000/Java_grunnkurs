public class Bøker {
    String tittel;
    double pris;
    String forfatter;
    String iSBNnummer;
    public void skrivUt(){
        System.out.print("Tittel: "+tittel+"\n");
        System.out.print("Pris: "+pris+"\n");
        System.out.print("Forfatter: "+forfatter+"\n");
        System.out.print("ISBN-nummer: "+iSBNnummer+"\n");
    }
    public static void main(String [] args){
        Bøker enBok = new Bøker();
        enBok.tittel = "Askeladder";
        enBok.pris = 100;
        enBok.forfatter = "suhail";
        enBok.iSBNnummer = "Askeladder";
        enBok.skrivUt();
    }
}
