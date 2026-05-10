public class KaartLezer {
    private String locatie;
    private double minSaldo = 4.0;

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    // inchecken
    public void inChecken(AnoniemeChipkaart kaart) {
        if (!kaart.isKaartGeldig()) {
            System.out.println("lukt niet, kaart is verlopen");
        } else if (kaart.getSaldo() < minSaldo) {
            System.out.println("lukt niet, je hebt te weinig geld");
        } else if (kaart.isIngecheckt()) {
            System.out.println("je bent al ingecheckt");
        } else {
            kaart.setIngecheckt(true);
            System.out.println("ingecheckt bij: " + locatie);
        }
    }

    // uitchecken
    public void uitChecken(AnoniemeChipkaart kaart) {
        if (!kaart.isIngecheckt()) {
            System.out.println("je bent niet eens ingecheckt");
        } else {
            double kosten = 4.0;
            kaart.setSaldo(kaart.getSaldo() - kosten);
            kaart.setIngecheckt(false);
            System.out.println("uitgecheckt bij: " + locatie + ". kost je €" + kosten);
        }
    }
}