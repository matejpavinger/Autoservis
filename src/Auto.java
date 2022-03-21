public class Auto {

    private double cena;
    private String spz;
    private String znacka;
    private String model;
    private Autoservis autoservis;

    public Auto(int cena, String spz, String znacka, String model, Autoservis autoservis) {
        this.cena = cena;
        this.spz = spz;
        this.znacka = znacka;
        this.model = model;
        this.autoservis = autoservis;
    }

    public double getCena() {
        return cena;
    }

    public String getSpz() {
        return spz;
    }

    public String getZnacka() {
        return znacka;
    }

    public String getModel() {
        return model;
    }

    public Autoservis autoservis() {
        return autoservis;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "cena=" + cena +
                ", spz=" + spz +
                ", znacka='" + znacka + '\'' +
                ", model='" + model + '\'' +
                ", autoservis=" + autoservis +
                '}';
    }
}
