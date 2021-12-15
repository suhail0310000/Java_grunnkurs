public class Bil implements Kjøretøy{
    public String type;
    public Dato førstegangsRegistert;
    public String skiltnummer;
    public double kgLastekapasitet;

    public Bil(String type, Dato førstegangsRegistert, String skiltnummer, double kgLastekapasitet){
        this.type = type;
        this.førstegangsRegistert = førstegangsRegistert;
        this.skiltnummer = skiltnummer;
        this.kgLastekapasitet = kgLastekapasitet;
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

    public double getLastekapasitet(){
        return this.kgLastekapasitet;
    }

}
