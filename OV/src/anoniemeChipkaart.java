import java.util.Date;

public class anoniemeChipkaart {
    // Attributen (Private)
    private String kaartnummer;
    public double saldo;
    private boolean geldig;
    private Date vervaldatum;

    // Constructor
    public anoniemeChipkaart(String kaartnummer, double saldo, boolean geldig, Date vervaldatum) {
        this.kaartnummer = kaartnummer;
        this.saldo = saldo;
        this.geldig = geldig;
        this.vervaldatum = vervaldatum;
    }

    // Methoden
    // Check of kaart geldig is
    public boolean checkGeldig() {
        if (geldig) {
            return true;
        } else {
            return false;
        }
    }
//    public void blokkerenKaart() {
//        geldig = false;
//        System.out.println("Kaart is geblokkeerd.");
//    }
        public String toString () {
            return "AnonlemeChipkaart{" +
                    "kaartnummer='" + kaartnummer + '\'' +
                    ", saldo=€" + saldo +
                    ", geldig=" + geldig +
                    ", vervaldatum=" + vervaldatum +
                    '}';
        }



}