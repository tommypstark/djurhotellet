// MIN ATT-GÖRA-LISTA IDAG:
// [x] 1. Skapa Katt med namn, ras och chipnummer
// [x] 2. Gör kattens fält private och skapa getters
// [x] 3. Skapa KattHotell med en privat lista av katter
// [x] 4. Skapa metod för att checka in en katt
// [ ] 5. Stoppa katter med samma chipnummer
// [ ] 6. Skapa metod som listar alla katter
// [ ] 7. Visa meddelande om hotellet är tomt

public class Main {
    public static void main(String[] args) {
        KattHotell hotell = new KattHotell();

        hotell.laggTill(new Katt("Bosse", 101, "Sieames"));
        hotell.laggTill(new Katt("Luna", 102, "Ragdoll"));
        hotell.laggTill(new Katt("Sara", 101, "Sara"));

        System.out.println("Antal: " + hotell.antalKatter());
    }
}