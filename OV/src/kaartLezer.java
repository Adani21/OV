 class KaartLezer {

    // Attributen
    private String lezerId;
    private String locatie;
    private boolean actief;
    private double minimumSaldo;

    // Constructor
    public KaartLezer(String lezerId, boolean actief) {
        this.lezerId = lezerId;
        this.actief = actief;
        this.minimumSaldo = 20;
    }
     public void setLocatie(String locatie) {
         this.locatie = locatie.toLowerCase();
     }
    // Kaart uitlezen
    public void leesKaart() {
        System.out.println("Kaartlezer leest kaart...");
    }

    // Niet kunnen inchecken als kaart ongeldig is
    // Niet kunnen inchecken als saldo te laag is
    public boolean inChecken(AnoniemeChipkaart kaart) {
        if (!kaart.isGeldig()) {
            return false;
        }
        if (!controleerSaldo(kaart)) {
            return false;
        }
        kaart.setIngecheckt(true);
        return true;
    }

    // Saldo controleren bij inchecken
    public boolean controleerSaldo(AnoniemeChipkaart kaart) {
        return kaart.getSaldo() >= minimumSaldo;
    }

    // Bericht krijgen of inchecken gelukt is
    public void geefMeldingIncheck(AnoniemeChipkaart kaart) {
        if (!kaart.isGeldig()) {
            System.out.println("Inchecken niet gelukt: kaart is ongeldig.");
        } else if (!controleerSaldo(kaart)) {
            System.out.println("Inchecken niet gelukt: onvoldoende saldo (minimaal €" + minimumSaldo + " vereist).");
        } else {
            System.out.println("Inchecken gelukt!");
        }
    }

    // Registratie in OV systeem bij incheck
    public void registreerIncheck(AnoniemeChipkaart kaart) {
        if (kaart.isGeldig() && controleerSaldo(kaart)) {
            System.out.println("Incheck geregistreerd in OV systeem.");
        } else {
            System.out.println("Incheck niet geregistreerd in OV systeem.");
        }
    }

    // Uitchecken bij een paal zodat het systeem weet dat je bent uitgestapt
    // Ritbedrag wordt afgetrokken van saldo
    public boolean uitChecken(AnoniemeChipkaart kaart) {
        if (!kaart.isGeldig() || !kaart.isIngecheckt()) {
            return false;
        }
        kaart.setSaldo(kaart.getSaldo() - 2.50);
        kaart.setIngecheckt(false);
        return true;
    }

    // Bericht krijgen of uitchecken gelukt is
    // Zien hoeveel geld is afgetrokken
    public void geefMeldingUitcheck(AnoniemeChipkaart kaart, boolean uitcheckGelukt) {
        if (uitcheckGelukt) {
            System.out.println("Uitchecken gelukt! €2.50 afgetrokken.");
            System.out.println("Huidig saldo: €" + kaart.getSaldo());
        } else {
            System.out.println("Uitchecken niet gelukt: je bent niet ingecheckt.");
        }
    }

    // Registratie in OV systeem bij uitcheck
    public void registreerUitcheck(boolean uitcheckGelukt) {
        if (uitcheckGelukt) {
            System.out.println("Uitcheck geregistreerd in OV systeem.");
        } else {
            System.out.println("Uitcheck niet geregistreerd in OV systeem.");
        }
    }

    public String toString() {
        return "KaartLezer{" +
                "lezerId='" + lezerId + '\'' +
                ", locatie='" + locatie + '\'' +
                ", actief=" + actief +
                '}';
    }
}