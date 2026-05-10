public class opwaardeerMachine {
    // Attributen
    private String machineId;
    private boolean werkend;
    private double[] bedragen;

    // Constructor
    public opwaardeerMachine(String machineId, boolean werkend) {
        this.machineId = machineId;
        this.werkend = werkend;

        // Beschikbare bedragen
        this.bedragen = new double[6];
        bedragen[0] = 5.00;
        bedragen[1] = 10.00;
        bedragen[2] = 20.00;
        bedragen[3] = 30.00;
        bedragen[4] = 40.00;
        bedragen[5] = 50.00;
    }

    // Toon alle beschikbare bedragen
    public void toonBedragen() {
        System.out.println("\n=== BESCHIKBARE BEDRAGEN ===");
        for (int i = 0; i < bedragen.length; i++) {
            System.out.println((i + 1) + ". €" + bedragen[i]);
        }
    }

    // Kies een bedrag op basis van nummer
    public double kiesBedrag(int nummer) {
        if (nummer >= 1 && nummer <= bedragen.length) {
            return bedragen[nummer - 1];
        }
        System.out.println("ongeldig bedrag gekozen!");
        return 0;
    }

    // Opwaarderen
    public boolean opwaarderen(AnoniemeChipkaart kaart, int bedragIndex) {
        if (!werkend) {
            System.out.println("machine is niet werkend!");
            return false;
        }

        double bedrag = kiesBedrag(bedragIndex);
        if (bedrag <= 0) {
            return false;
        }

        kaart.setSaldo(kaart.getSaldo() + bedrag);
        return true;
    }

    // Melding geven
    public boolean geefMeldingOpwaarderen(AnoniemeChipkaart kaart, int bedragIndex) {
        if (!werkend) {
            System.out.println("machine is niet werkend! opwaarderen niet mogelijk.");
            return false;
        }

        double bedrag = kiesBedrag(bedragIndex);
        if (bedrag <= 0) {
            System.out.println("opwaarderen niet gelukt! ongeldig bedrag.");
            return false;
        }

        System.out.println("opwaarderen gelukt! €" + bedrag + " toegevoegd. nieuw saldo: €" + kaart.getSaldo());
        return true;
    }

    public String toString() {
        return "OpwaardeerMachine{" +
                "machineId='" + machineId + '\'' +
                ", werkend=" + werkend +
                '}';
    }
}