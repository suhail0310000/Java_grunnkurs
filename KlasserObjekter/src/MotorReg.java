import java.util.ArrayList;

public class MotorReg {
    public static void main(String[] args){
        //Skrive ut via valige arrays
        // opprett et array av Biler
       /* Bil[] register = new Bil[100];
        Dato dato1 = new Dato(30,10,2000);
        Bil hybridBil = new Bil("hybridBil",dato1,"nv522663");
        Dato dato2 = new Dato(10,10,2001);
        Bil elBil = new Bil("Elbil", dato2, "12345667");
        // Sett inn noen biler i arrayet

        register[0] = hybridBil;
        register[1] = elBil;*/




        // List motorvognregisteret (arrayet) ved hjelp av en løkke

       /*for(Bil enBil : register){
           if(enBil != null){
               System.out.println(enBil);
           }
       }*/

        //Skrive ut via arraylist
        ArrayList<Bil> register = new ArrayList<>();

        Dato dato1 = new Dato(30,10,2000);
        Bil hybridBil = new Bil("hybridBil",dato1,"nv522663");
        Dato dato2 = new Dato(10,10,2001);
        Bil elBil = new Bil("Elbil", dato2, "12345667");
        register.add(hybridBil);
        register.add(elBil);
        for(int i = 0; i<register.size(); i++){
            System.out.println(register.get(i));
        }
    }
}
