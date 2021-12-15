class Person2{
    public String personnummer;
    public String navn;
    public String adresse;
    public String telefonnr;

    public String toString(){
        String ut = "";
        ut+= "Personnummer: "+this.personnummer+"\n";
        ut+= "Navn: "+this.navn+"\n";
        ut+= "Adresse: "+this.adresse+"\n";
        ut+= "Telefonnr: "+telefonnr+"\n";
        return ut;
    }
}
class toString{
    public static void main(String[] args){
        Person2 enPerson = new Person2();
        enPerson.navn = "Suhail";
        enPerson.personnummer = "12345678910";
        enPerson.adresse = "ravnåsveien";
        enPerson.telefonnr = "45121340";
        System.out.print(enPerson);
    }
}
