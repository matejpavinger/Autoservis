public class Start {

    public static void main(String[] args) {
        Autoservis servis1 = new Autoservis("CR", "Praha", 12000);
        Autoservis servis2 = new Autoservis("SR", "Bratislava", 81102);

        Databaze databaze = new Databaze();
        databaze.nakup("Matej", 0, 15, 03, 2022, new Auto(300000, "7A25025", "Skoda", "Fabia", servis1));
        databaze.prodej("Marek", 21, 17, 06, 2022, databaze.najdi("7A25025"));
        databaze.oprava("Tomas", 21, 5, 8, 2023, 10000);
        databaze.nakup( "Honza", 0, 3, 4, 2022, new Auto(450000, "8B65034", "Skoda", "Oktavia", servis2));
        databaze.oprava("Danča", 21, 18, 3, 2022, 4000);


        for (EET eet : Databaze.eet) {
            System.out.println(eet.toString());
        }
        for (Auto auto : Databaze.databaze) {
            System.out.println(auto.toString());
        }
        System.out.println("Balance: "+databaze.balance);
        databaze.prehledAut(servis1);
    }
}
