class Papirbok extends Bok{
    private int ISBN;

    public Papirbok(String tittel,String forfatter,double pris, int ISBN){
        super(tittel,forfatter,pris);
        this.ISBN = ISBN;
    }

    public String toString(){
        String ut = "ISBN-nummer: "+ISBN;
        return super.toString()+"\nISBN: "+ut;
    }

}



