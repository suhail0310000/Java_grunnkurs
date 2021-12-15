import java.util.ArrayList;

public class Oppgave4 {
    public static void main(String[] args){
        ArrayList<Integer> liste = new ArrayList<>();
        for(int i = 1; i<10; i++){
            liste.add(i);
        }
        int[] liste1 = new int[liste.size()];

        for(int i = 0; i<liste1.length; i++){
            liste1[i] = liste.get(i);
        }

        for(int i : liste1){
            System.out.print(liste1[i]+" ");
        }
    }
}
