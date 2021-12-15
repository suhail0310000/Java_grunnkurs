import javax.swing.*;

public class Person {
    private String fornavn;
    private String etterNavn;
    private String adresse;
    private String telefonnr;

    public Person(String fornavn, String etterNavn, String adresse, String telefonnr){
        this.fornavn = fornavn;
        this.etterNavn = etterNavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    public String getFornavn(){
        return fornavn;
    }
    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }
    public String getEtternavn(){
        return etterNavn;
    }
    public void setEtternavn(String etterNavn){
        this.etterNavn = etterNavn;
    }
    public String getAdresse(){
        return adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }
    public String getTlf(){
        return telefonnr;
    }
    public void setTelefonnr(String telefonnr){
        this.telefonnr = telefonnr;
    }
    public void skrivUt(){
        String ut = getFornavn()+" "+getEtternavn()+" bor i "+getAdresse()+". Telefonnummeret hans er "+getTlf();
        JOptionPane.showMessageDialog(null,ut);
    }

    public static void main(String[] args){
        String innforNavn = JOptionPane.showInputDialog("Skriv inn fornavn:");
        String innetterNavn = JOptionPane.showInputDialog("Skriv inn etternavn:");
        String innAdresse = JOptionPane.showInputDialog("Skriv inn adresse:");
        String innTlf = JOptionPane.showInputDialog("Skriv inn tlf:");
        Person enPerson = new Person(innforNavn,innetterNavn,innAdresse,innTlf);
        enPerson.skrivUt();
    }
}
