import java.time.LocalDate;

public class AnoniemeChipkaart {
    // de spulletjes van de kaart
    private String kaartnummer;
    private double saldo;
    private boolean geldig;
    private LocalDate vervaldatum;
    private boolean ingecheckt;

    // constructor om de kaart aan te maken
    public AnoniemeChipkaart(String kaartnummer, double saldo, boolean geldig, LocalDate vervaldatum) {
        this.kaartnummer = kaartnummer;
        this.saldo = saldo;
        this.geldig = geldig;
        this.vervaldatum = vervaldatum;
        this.ingecheckt = false;
    }

    // getters en setters
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public boolean isGeldig() { return geldig; }
    public boolean isIngecheckt() { return ingecheckt; }
    public void setIngecheckt(boolean status) { this.ingecheckt = status; }
    public LocalDate getVervaldatum() { return vervaldatum; }

    // Check of kaart geldig is - controleert vervaldatum
    public boolean isKaartGeldig() {
        if (!geldig) {
            return false;
        }

        LocalDate vandaag = LocalDate.now();
        if (vandaag.isAfter(vervaldatum)) {
            return false;
        }

        return true;
    }

    // deze methode print de info van de kaart
    public String kaartInfo() {
        return "kaart: " + kaartnummer + " | saldo: €" + saldo + " | ingecheckt: " + ingecheckt + " | vervaldatum: " + vervaldatum;
    }
}