import java.util.ArrayList;

public class Databaze {
    public static float balance;
    public static ArrayList<Auto> databaze;
    public static ArrayList<EET> eet;
    public int kod;

    public Databaze() {
        balance = 0;
        databaze = new ArrayList<Auto>();
        eet = new ArrayList<EET>();
        int kod=0;
    }

    public static void setBalance(double castka) {
        balance += castka;
    }

    public static void addAuto(Auto auto){
        databaze.add(auto);
    }

    public static void odeberAuto(Auto auto){
        databaze.remove(auto);
    }

    public void nakup (String osoba, int dan, int den, int mesic, int rok, Auto auto){
        kod++;
        Databaze.eet.add(new EET("nakup", osoba, dan, kod, den, mesic, rok));
        Databaze.addAuto(auto);
        Databaze.setBalance(-auto.getCena());
    }

    public void prodej (String osoba, int dan, int den, int mesic, int rok, Auto auto){
        kod++;
        Databaze.eet.add(new EET("prodej", osoba, dan, kod, den, mesic, rok));
        Databaze.odeberAuto(auto);
        Databaze.setBalance(auto.getCena()+(auto.getCena() * dan/100));
    }

    public void oprava (String osoba, int dan, int den, int mesic, int rok, int cena){
        kod++;
        Databaze.eet.add(new EET("oprava", osoba, dan, kod, den, mesic, rok));
        Databaze.setBalance(cena);
    }

    public Auto najdi (String spz){
        for(Auto auto:databaze){
            if(auto.getSpz().equals(spz)){
                return auto;
            }
        }
        System.out.println("V databázi není žádné auto s danou SPZ");
        return null;
    }

    public Auto prehledAut(Autoservis autoservis){
        for(Auto auto:databaze) {
            if (auto.autoservis().equals(autoservis)) {
                return auto;
            }
        }
        System.out.println("Daný servis nemá momentálně žádná auta k dispozici");
        return null;
    }
}

