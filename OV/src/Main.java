import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AnoniemeChipkaart kaart = new AnoniemeChipkaart("1234567890", 20, true, LocalDate.of(2029, 10, 27));
        // We starten met een lezer zonder vaste locatie
        KaartLezer lezer = new KaartLezer("L001", true);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("=== OV SYSTEEM MENU ===");
            System.out.println("1. Inchecken");
            System.out.println("2. Uitchecken");
            System.out.println("3. Afsluiten");
            System.out.print("Kies een optie (1-3): ");

            int keuze = scanner.nextInt();
            scanner.nextLine(); // Belangrijk: vangt de 'enter' op na het getal
            System.out.println();

                switch (keuze) {
                    case 1:
                        System.out.println("=== INCHECK PROCES ===");
                        // Vraag hier om de locatie
                        System.out.print("Voer incheck-locatie in: ");
                        String inlocatie = scanner.nextLine();
                        lezer.setLocatie(inlocatie);

                        lezer.leesKaart();
                        lezer.inChecken(kaart);
                        lezer.geefMeldingIncheck(kaart);
                        lezer.registreerIncheck(kaart);

                        // Toon de ingestelde locatie
                        System.out.println("Ingecheckt bij station: " + inlocatie);
                        System.out.println();
                        break;

                    case 2:
                        System.out.println("=== UITCHECK PROCES ===");
                        if (!kaart.isIngecheckt()) {
                            System.out.println("Fout: Je bent niet ingecheckt.");
                            break;
                        }

                        // Vraag hier om de locatie
                        System.out.print("Voer uitcheck-locatie in: ");
                        String uitlocatie = scanner.nextLine();
                        lezer.setLocatie(uitlocatie);

                        lezer.leesKaart();
                        boolean uitcheckGelukt = lezer.uitChecken(kaart);
                        lezer.geefMeldingUitcheck(kaart, uitcheckGelukt);
                        lezer.registreerUitcheck(uitcheckGelukt);

                        System.out.println("Uitgecheckt bij station: " + uitlocatie);
                        System.out.println();
                        break;

                    case 3:
                        if (kaart.isIngecheckt()) {
                            System.out.println("Je moet eerst uitchecken voordat je kunt afsluiten.");
                        } else {
                            System.out.println("Systeem wordt afgesloten...");
                            running = false;
                        }
                        break;

                    default:
                        System.out.println("Ongeldige keuze.");
                }
            }
            scanner.close();
        }
    }