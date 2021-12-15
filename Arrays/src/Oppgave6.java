public class Oppgave6 {
    public static void main(String[] args){
        int[] tall1 = {45,34, 5, 8, 10, 2, 13, 25};
        int[] tall2 = {45,34, 5, 8, 10, 2, 13, 25,2};
        if(tall1.length != tall2.length){
            System.out.println("Arrayene er ikke like da de ikke er like lange");
        }
        else{
            boolean like = true;
            for(int i = 0; i<tall1.length; i++){
                if(tall1[i] != tall2[i]){
                    like = false;
                }
            }
            if(like){
                System.out.println("Arrayene er like");
            }else{
                System.out.println("Arrayene er ikke like");
            }
        }
    }
}


