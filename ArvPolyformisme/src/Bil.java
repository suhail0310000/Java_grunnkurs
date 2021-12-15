public class Bil extends Kjøretøy{
    public double kgLastekapasitet;

    public Bil(String type, Dato førstegangsRegistert, String skiltnummer,double kgLastekapasitet){
        super(type,førstegangsRegistert,skiltnummer);
        this.kgLastekapasitet = kgLastekapasitet;
    }

    public double getLastekapasitet(){
        return this.kgLastekapasitet;
    }
}
