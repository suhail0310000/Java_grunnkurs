public class Oppgave2 {
    public static void main(String[] args){
        int[] tall = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        int antall = 0;
        double gjennomSnitt = 0;

        //GjennomSnitt og sum
        /*double gjennomSnitt = 0;
        for(int i = 0; i <tall.length; i++){
            sum += i;
            antall++;
        }
        gjennomSnitt = sum/antall;
        System.out.println("Sum: "+sum);
        System.out.println("Antall: "+antall);
        System.out.println("GjennomSnitt: "+gjennomSnitt);*/

        //Summere alle tall over 5 og gjennomsnitt
        /*for(int i = 0; i<tall.length; i++){
            if(tall[i] > 5){
                sum += tall[i];
                antall++;
            }
        }
        gjennomSnitt = sum/antall;
        System.out.print(gjennomSnitt);*/
        for(int i : tall){
            System.out.print(i+" ");
        }

    }
}
