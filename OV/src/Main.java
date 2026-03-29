import java.util.Date;


    public static void main(String[] args) {
        // Maak klassen aan
        anoniemeChipkaart kaart = new anoniemeChipkaart("1234567890", 5.50,true, new Date(129,10,27));
        kaartLezer lezer = new kaartLezer("L001", "Amsterdam Centraal", true);
        ovSysteem system = new ovSysteem("OV-1", 1);

        System.out.println(kaart);
        System.out.println(lezer);
        System.out.println(system);
        System.out.println();
        // Incheck proces
        System.out.println("=== INCHECK PROCES ===");
        System.out.println("1. Kaart lezen...");
        lezer.leesKaart();
        System.out.println("2. Saldo controleren...");
        lezer.controleerSaldo(kaart);
        System.out.println("3. inchecken...");
        lezer.inChecken(kaart);
        System.out.println("4. Melding geven...");
        lezer.geefMelding(kaart);
        System.out.println("5. Registreren in systeem...");
        system.registreerIncheck(kaart,lezer);
        System.out.println();

    }
