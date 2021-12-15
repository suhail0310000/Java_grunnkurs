public class Motorsykkel implements Kjøretøy{
    public String type;
    public Dato førstegangsRegistert;
    public String skiltnummer;

    public Motorsykkel(String type, Dato førstegangsRegistert, String skiltnummer){
        this.type = type;
        this.førstegangsRegistert = førstegangsRegistert;
        this.skiltnummer = skiltnummer;
    }

    public String getType(){
        return this.type;
    }

    public Dato getFørstegangsregistrert(){
        return this.førstegangsRegistert;
    }

    public String getSkiltnummer(){
        return this.skiltnummer;
    }
}
