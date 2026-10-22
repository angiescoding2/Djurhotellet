// [x] 1. Skapa en katt med namn, ras och chipnummer.
// [x] 2. Skapa ett katthotell med ett privat register över katter.
// [x] 3. Förhindra att två katter med samma chipnummer checkas in.
// [x] 4. Visa namn, ras och chipnummer för alla incheckade katter.
// [x] 5. Visa ett meddelande om hotellet är tomt.
// [x] 6. Säga till om hotellet är helt tomt när vi ropar upp
// [x] 7. Göra så att hotellet kan leta upp en katt på namn (eller svara tomt om den saknas)
// [x] 8. Bygga meny-loopen som snurrar med Scanner tills vi väljer att avsluta
// [x] 9. Koppla ihop val 1-4 med hotellet (och skydda sökningen i val 3 mot krasch med en grindvakt)

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KattHotell hotell = new KattHotell();
        int val = 0;
        while (val != 4) {
            System.out.println("\n--- Tass & Mys Meny ---");
            System.out.println("1. Checka in katt");
            System.out.println("2. Lista alla incheckade katter");
            System.out.println("3. Sök katt på namn");
            System.out.println("4. Avsluta programmet");
            System.out.print("Välj: ");

            val = scanner.nextInt();
            scanner.nextLine();
            if (val == 1) {
                System.out.print("Namn: ");
                String namn = scanner.nextLine();

                System.out.print("Chipnummer: ");
                int chip = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Ras: ");
                String ras = scanner.nextLine();
                hotell.checkaIn(new Katt(namn, ras, chip));
            } else if (val == 2) {
                hotell.listaAlla();
            } else if (val == 3) {
                System.out.print("Ange namn att söka: ");
                String soktNamn = scanner.nextLine();
                Katt hittad = hotell.hittaNamn(soktNamn);
                if (hittad != null) {
                    System.out.println("Hittad: " + hittad.getNamn()
                            + " (" + hittad.getRas() + ") - Chip: "
                            + hittad.getChipnummer());
                } else {
                    System.out.println("Ingen katt med det namnet är incheckad här.");
                }
            }
        }
    }
}