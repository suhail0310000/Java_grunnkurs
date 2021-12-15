public class Oppgave4 {
    public static void main(String[] args){
        int sum = 0;
        int antall = 0;
        double gjennomSnitt = 0;
        for(int i = 0; i<100; i+=2){
            sum += i;
            antall++;
        }
        gjennomSnitt = sum/antall;
        System.out.print("Gjennomsnittet er: "+gjennomSnitt);
    }
}
