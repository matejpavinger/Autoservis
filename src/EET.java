public class EET {
    private String typ;
    private String osoba;
    private int dan;
    public int kod=0;
    private int den; //formát dd
    private int mesic; //formát mm
    private int rok; //formát rrrr

    public EET(String typ, String osoba, int dan, int kod, int den, int mesic, int rok) {
        this.typ = typ;
        this.osoba = osoba;
        this.dan = dan;
        this.kod = kod;
        this.den = den;
        this.mesic = mesic;
        this.rok = rok;
    }



    @Override
    public String toString() {
        return "EET{" +
                "typ='" + typ + '\'' +
                ", osoba='" + osoba + '\'' +
                ", dan=" + dan +
                ", kod=" + kod +
                ", den=" + den +
                ", mesic=" + mesic +
                ", rok=" + rok +
                '}';
    }
}
