import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Oppgave3 {
    public static void main(String[] args){
        int [] liste = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> liste2 = new ArrayList<>();
        for(int i: liste){
            liste2.add(i);
        }
        for(int i = 0; i<liste2.size(); i++){
            System.out.print(liste2.get(i)+" ");
        }


    }
}
