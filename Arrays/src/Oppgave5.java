public class Oppgave5 {
    public static void main(String[] args){
        int[] tall = {45, 34, 5, 8, 10, 2, 13, 50};

        //Største tall
       /* for(int i = 0; i<tall.length; i++){
            if(tall[0] < tall[i]){
                tall[0] = tall[i];
            }
        }
        System.out.print(tall[0]);*/
        //Minste tll
        for(int i = 0; i<tall.length; i++){
            if(tall[0] > tall[i]){
                tall[0] = tall[i];
            }
        }
        System.out.print(tall[0]);
    }
}
