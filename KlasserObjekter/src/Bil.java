public class Bil {
    public String type;
    public Dato førstegangsRegistert;
    public String skiltnummer;

    public Bil(String type, Dato førstegangsRegistert, String skiltnummer){
        this.type = type;
        this.førstegangsRegistert = førstegangsRegistert;
        this.skiltnummer = skiltnummer;
    }

    public String toString(){
        String ut = "";
        ut+= "Type: "+this.type;
        ut+= "Førstegangsregistrert: "+ this.førstegangsRegistert;
        ut+= "Skiltnummer: "+ this.skiltnummer;
        return ut;
    }
}
