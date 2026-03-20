import java.util.Date;

public class anoniemeChipkaart {
    // Attributen (Private)
    private String kaartnummer;
    public double saldo;
    private boolean geldig;
    public double bedrag;
    private Date vervaldatum;

    // Constructor
    public anoniemeChipkaart(String kaartnummer, double saldo, double bedrag, boolean geldig, Date vervaldatum) {
        this.kaartnummer = kaartnummer;
        this.saldo = saldo;
        this.geldig = geldig;
        this.vervaldatum = vervaldatum;
        this.bedrag = bedrag;
    }

    // Methoden
    // Check of kaart geldig is
    public boolean checkGeldig() {
        if (geldig) {
            System.out.println("Kaart is geldig");
            return true;
        } else {
            System.out.println("Kaart is ongeldig!");
            return false;
        }
    }

    public void aftrekkenSaldo() {
        // Check of kaart geldig is
        if (!checkGeldig()) {
            return;
        }

        // Check of saldo voldoende is
        if (saldo < bedrag) {
            System.out.println("Onvoldoende saldo! Je hebt €" + saldo + " maar wilt €" + bedrag + " aftrekken.");
            return;
        }

        // Aftrekken
        saldo -= bedrag;
        System.out.println("€" + bedrag + " afgetrokken. Nieuw saldo: €" + saldo);
    }

//    public void blokkerenKaart() {
//        geldig = false;
//        System.out.println("Kaart is geblokkeerd.");
//    }



}