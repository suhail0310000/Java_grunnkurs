public class Oppgave1 {
    public static void main(String[] args){
        int [] liste = {1,3,6,2,7,10,23,6,3,6};

        //oppg1a
        for(int i : liste){
            System.out.print(i+" ");
        }
        System.out.println();

        //oppg1b
        for(int i = liste.length-1; i>=0; i--){
            System.out.print(liste[i]+" ");
        }
        System.out.println();
        //oppg1c
        int i = 0;
        int antall = 0;
        double sum = 0;
        while(i<liste.length){
            antall++;
            sum+=liste[i];
            i++;
        }
        System.out.print("Antall: "+antall);
        System.out.print("Sum: "+sum);
        System.out.print("i: "+i);
        double gjennomSnitt = sum/antall;
        System.out.println("Gjennomsnitt: "+gjennomSnitt);

    }
}
