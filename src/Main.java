import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // kaartje maken
        AnoniemeChipkaart kaart = new AnoniemeChipkaart("1234-5678", 0.0, true, LocalDate.of(2029, 1, 1));
        KaartLezer lezer = new KaartLezer();
        opwaardeerMachine machine = new opwaardeerMachine("OM-001", true);
        Scanner input = new Scanner(System.in);
        boolean doorgaan = true;

        while (doorgaan) {
            System.out.println("\n--- ov systeem ---");
            // roepen hier de eigen methode aan voor info
            System.out.println(kaart.kaartInfo());
            System.out.println("1. geld laden (opwaardeermachine)");
            System.out.println("2. inchecken");
            System.out.println("3. uitchecken");
            System.out.println("4. stoppen");
            System.out.print("kies iets: ");

            int keuze = input.nextInt();
            input.nextLine();

            switch (keuze) {
                case 1:
                    machine.toonBedragen();
                    System.out.print("kies een bedrag (1-6): ");
                    int bedragKeuze = input.nextInt();
                    machine.opwaarderen(kaart, bedragKeuze);
                    machine.geefMeldingOpwaarderen(kaart, bedragKeuze);
                    break;
                case 2:
                    System.out.print("station: ");
                    String plekIn = input.nextLine();
                    lezer.setLocatie(plekIn);
                    lezer.inChecken(kaart);
                    break;
                case 3:
                    System.out.print("station: ");
                    String plekUit = input.nextLine();
                    lezer.setLocatie(plekUit);
                    lezer.uitChecken(kaart);
                    break;
                case 4:
                    doorgaan = false;
                    System.out.println("laters!");
                    break;
                default:
                    System.out.println("die optie is er niet");
            }
        }
        input.close();
    }
}