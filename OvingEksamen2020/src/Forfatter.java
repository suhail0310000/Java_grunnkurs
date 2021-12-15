public class Forfatter {
    private String navn;
    private String født;

    public Forfatter(String navn, String født){
        this.navn = navn;
        this.født = født;
    }

    public String getNavn(){
        return this.navn;
    }

    public void setNavn(String navn){
        this.navn = navn;
    }

    public String getFødt(){
        return this.født;
    }

    public void setFødt(String født){
        this.født = født;
    }

    public String toString(){
        String ut = getNavn()+" er født i: "+getFødt();
        return ut;
    }
}
