public class Oppgave8 {
    public static void main(String[] args){
        int i = 0;
        int sum = 0;
        int antall = 0;
        double gjennomSnitt = 0;
        while(i<100){
            sum+=i;
            i+=2;
            antall++;
        }
        gjennomSnitt = sum/antall;
        System.out.print(gjennomSnitt);
    }
}
