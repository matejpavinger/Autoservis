public class Autoservis {

    private String lokace;
    private String mesto;
    private int psc;

    public Autoservis(String lokace, String mesto, int psc) {
        this.lokace = lokace;
        this.mesto = mesto;
        this.psc = psc;
    }

    public String getLokace() {
        return lokace;
    }

    public String getmesto() {
        return mesto;
    }

    public int getPsc(){
        return psc;
    }

    @Override
    public String toString() {
        return "Autoservis{" +
                "lokace=" + lokace + '\'' +
                ", mesto=" + mesto + '\'' +
                ", psc=" + psc + '\'' +
                '}';
    }
}
