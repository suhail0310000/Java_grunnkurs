public class Oppgave1b {
    public static void main(String[] args){
        int i = 2;
        int antall = 0;
        int sum = 0;
        while(i<=10){
            sum+=i;
            i+=2;
            antall++;
        }
        double gjennomSnitt = (double)sum/antall;
        System.out.print("Gjennomsnitt: "+gjennomSnitt);
    }
}
