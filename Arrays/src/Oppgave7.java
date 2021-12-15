public class Oppgave7 {
    public static void main(String[] args){
        int partall = 0;
        int oddetall = 0;
        int[] liste = {1,2,3,4,5,6,7,8,9};
        for(int i = 0; i<liste.length; i++){
            if((liste[i]%2) == 0){
                partall++;
            }if((liste[i]%2) == 1){
                oddetall++;
            }
        }
        System.out.println("Partall "+partall);
        System.out.println("Oddetall "+oddetall);
    }
}
