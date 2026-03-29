public class kaartLezer {
    // Attributen
    private String lezerId;
    private String locatie;
    private boolean actief;
    private double minimumSaldo;

    // Constructor
    public kaartLezer(String lezerId, String locatie, boolean actief) {
        this.lezerId = lezerId;
        this.locatie = locatie;
        this.actief = actief;
        this.minimumSaldo = 20;
    }

    // Methoden
    public void leesKaart() {
        System.out.println("Kaartlezer leest kaart...");
    }

    public boolean inChecken(anoniemeChipkaart kaart) {
        if (kaart.checkGeldig() && controleerSaldo(kaart)) {
            System.out.println("Incheken gelukt!");
            return true;
        }
        System.out.println("inchecken niett gelukt!");
        return false;
    }

    public boolean controleerSaldo(anoniemeChipkaart kaart){
        if (kaart.saldo >= minimumSaldo) {
            System.out.println("Saldo controle: kaart heeft voldoende saldo");
            return true;
        }
        else{
            System.out.println("kaart heeft onvoldoende saldo!");
            return false;
        }
    }

    public boolean geefMelding(anoniemeChipkaart kaart) {
        if (kaart.checkGeldig() && controleerSaldo(kaart)) {
            System.out.println("Gelukt!");
            return true;
        }
        else  {
            System.out.println("niet gelukt!");
            return false;
        }
    }

    public String toString() {
        return "Kaartlezer{" +
                "lezerId='" + lezerId + '\'' +
                ", locatie='" + locatie + '\'' +
                ", actief=" + actief +
                '}';
    }
}