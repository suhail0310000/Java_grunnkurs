public class Oppgave3 {
    public static void main(String[]args){
        String[] navnList = {"Per","Hansen","Line","Olsen","Ola","Pedersen","Kari","Finnsen"};
        for(int i = 0; i < navnList.length; i+=2){
            System.out.println(navnList[i]+" "+navnList[i+1]);
        }
    }
}
