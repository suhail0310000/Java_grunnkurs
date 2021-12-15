import java.util.ArrayList;

public class Oppgave1 {
    public static void main(String[] args){
        ArrayList<Integer> liste = new ArrayList<>();
        for(int i = 0; i<10; i++){
            liste.add(i);
        }
        System.out.println("Element nummer 3: "+liste.get(3));
        System.out.println("Element nummer 6: "+liste.get(6));
        //Element 3
        /*System.out.println(liste[3]);
        System.out.println(liste[6]);*/
    }
}
