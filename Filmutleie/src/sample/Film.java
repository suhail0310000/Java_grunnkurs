package sample;

public class Film {
    public String tittel;
    public double utLeiePris;
    public Person leidAv;

    // konstruktør inn her
    public Film(String tittel, double utLeiePris, Person leidAv){
        this.tittel = tittel;
        this.utLeiePris = utLeiePris;
        this.leidAv = leidAv;
    }

}
