import java.time.LocalDate;

 class AnoniemeChipkaart {

    // Attributen (allemaal private voor encapsulatie)
    private String kaartnummer;
    private double saldo;
    private boolean geldig;
    private LocalDate vervaldatum;
    private boolean ingecheckt;

    // Constructor
    public AnoniemeChipkaart(String kaartnummer, double saldo, boolean geldig, LocalDate vervaldatum) {
        this.kaartnummer = kaartnummer;
        this.saldo = saldo;
        this.geldig = geldig;
        this.vervaldatum = vervaldatum;
        this.ingecheckt = false;
    }

    // Getters & Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isGeldig() {
        return geldig;
    }

    public boolean isIngecheckt() {
        return ingecheckt;
    }

    public void setIngecheckt(boolean status) {
        this.ingecheckt = status;
    }


    public String toString() {
        return "AnoniemeChipkaart{" +
                "kaartnummer='" + kaartnummer + '\'' +
                ", saldo=€" + saldo +
                ", geldig=" + geldig +
                ", vervaldatum=" + vervaldatum +
                ", ingecheckt=" + ingecheckt +
                '}';
    }
}