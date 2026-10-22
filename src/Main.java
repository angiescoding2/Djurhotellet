// [x] 1. Skapa en katt med namn, ras och chipnummer.
// [x] 2. Skapa ett katthotell med ett privat register över katter.
// [x] 3. Förhindra att två katter med samma chipnummer checkas in.
// [ ] 4. Visa namn, ras och chipnummer för alla incheckade katter.
// [ ] 5. Visa ett meddelande om hotellet är tomt.

public class Main {
    public static void main(String[] args) {
        System.out.println("Välkommen till Djurhotellet!");
        KattHotell hotell = new KattHotell();
        hotell.checkaIn(new Katt("Misse", "Ragdoll", 1001));
        hotell.checkaIn(new Katt("Luna", "Siamese", 1002));
        hotell.checkaIn(new Katt("Simba", "Bengal", 1001));
        System.out.println("Antal incheckade katter: " + hotell.antalKatter());

    }
}