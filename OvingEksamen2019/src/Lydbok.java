class Lydbok extends Bok{
    private int lengdeMin;
    public Lydbok(String tittel,String forfatter,double pris,int lengdeMin){
        super(tittel,forfatter,pris);
        this.lengdeMin = lengdeMin;
    }


    public String toString(){
        String ut = "Lengde minutter: "+lengdeMin;
        return super.toString()+ ut;
    }
}
