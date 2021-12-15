public class Kjøretøy {
    public String type;
    public Dato førstegangsRegistert;
    public String skiltnummer;

    public Kjøretøy(String type, Dato førstegangsRegistert, String skiltnummer){
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

    public static void main(String[] args){
        Dato dato1 = new Dato(3,10,2000);
        Dato dato2 = new Dato(10,12,2002);
        Kjøretøy Bil1 = new Bil("elbil",dato1,"123456789",10);
        Kjøretøy motorsykkel1 = new Motorsykkel("tohjulstrekk",dato2,"123456789100");

        Kjøretøy[] liste = new Kjøretøy[10];
        liste[0] = Bil1;
        liste[1] = motorsykkel1;

        // for each og vanlig
        /*for(Kjøretøy enKjøretøy: liste){
            if(enKjøretøy != null){
                System.out.println(enKjøretøy.getType()+" "+enKjøretøy.getFørstegangsregistrert()+" "+enKjøretøy.getSkiltnummer());
                System.out.println("-----------");
            }
        }*/

        for (int i=0;i<liste.length && liste[i]!=null;i++){
            System.out.println(liste[i].getType()+" "+liste[i].getFørstegangsregistrert()+" "+liste[i].getSkiltnummer());
        }
    }

}
