import javax.swing.*;

public class BensinKjøp {
    String sted;
    String bensin;
    double antallL;
    double prisL;
    String tidspunkt;

    public BensinKjøp(String sted, String bensin,double antallL, double prisL,String tidspunkt){
        this.sted = sted;
        this.bensin = bensin;
        this.antallL = antallL;
        this.prisL = prisL;
        this.tidspunkt = tidspunkt;
    }

    public String getSted(){
        return sted;
    }

    public void setSted(){
        this.sted = sted;
    }


    public String getBensin(){
        return bensin;
    }

    public void setBensin(){
        this.bensin = bensin;
    }


    public String getTidspunkt(){
        return tidspunkt;
    }

    public void setTidspunkt(){
        this.tidspunkt = tidspunkt;
    }


    public double getAntallL(){
        return antallL;
    }

    public void setAntallL(){
        this.antallL = antallL;
    }

    public double getPrisL(){
        return prisL;
    }

    public void setPrisL(){
        this.prisL = prisL;
    }

    public String finnTotalPris(){
        double totalPris = getPrisL()*getAntallL();
        String ut = String.format("%.2f", totalPris);
        return ut;
    }
    public static void main(String[] args){
        double innAntallL = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn antall L"));
        BensinKjøp enBensin = new BensinKjøp("Oslo","Diesel",innAntallL,10,"10:00");
        System.out.print(enBensin.finnTotalPris());
    }
}
