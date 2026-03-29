public class ovSysteem {
    // Attributen
    private String systemId;
    private int aantalKaarten;

    // Constructor
    public ovSysteem(String systemId, int aantalKaarten) {
        this.systemId = systemId;
        this.aantalKaarten = aantalKaarten;
    }

    // Methoden
    public void registreerIncheck(anoniemeChipkaart kaart, kaartLezer lezer) {
       if (kaart.checkGeldig() && lezer.controleerSaldo(kaart)){
           System.out.println("Incheck geregistreerd in OV systeem");
       }
        else {
            System.out.println("Incheck niet geregistreerd in OV systeem");
       }
    }
    public String toString() {
        return "OVSystem{" +
                "systemId='" + systemId + '\'' +
                ", aantalKaarten=" + aantalKaarten +
                '}';
    }
}