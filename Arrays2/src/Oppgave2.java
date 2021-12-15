import java.util.ArrayList;

public class Oppgave2 {
    public static void main(String[] args){
        ArrayList<Integer> liste = new ArrayList<>();
        for(int i = 0; i<10; i++){
            liste.add(i);
        }
        liste.add(11);
        liste.add(12);
        liste.remove(1);
        liste.remove(1);
        for(int i = 0; i<liste.size(); i++){
            System.out.print(liste.get(i)+" ");
        }



    }
}
