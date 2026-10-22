// [x] 1. Skapa en katt med namn, ras och chipnummer.
// [x] 2. Skapa ett katthotell med ett privat register över katter.
// [x] 3. Förhindra att två katter med samma chipnummer checkas in.
// [x] 4. Visa namn, ras och chipnummer för alla incheckade katter.
// [x] 5. Visa ett meddelande om hotellet är tomt.
// [x] 6. Säga till om hotellet är helt tomt när vi ropar upp
// [x] 7. Göra så att hotellet kan leta upp en katt på namn (eller svara tomt om den saknas)
// [ ] 8. Bygga meny-loopen som snurrar med Scanner tills vi väljer att avsluta
// [ ] 9. Koppla ihop val 1-4 med hotellet (och skydda sökningen i val 3 mot krasch med en grindvakt)

public class Main {
    public static void main(String[] args) {
        System.out.println("Välkommen till Djurhotellet!");
        KattHotell hotell = new KattHotell();
        hotell.listaAlla();
        hotell.checkaIn(new Katt("Misse", "Ragdoll", 1001));
        hotell.checkaIn(new Katt("Luna", "Siamese", 1002));
        hotell.checkaIn(new Katt("Simba", "Bengal", 1001));
        System.out.println("Antal incheckade katter: " + hotell.antalKatter());
        hotell.listaAlla();
    }
}