// MIN ATT-GÖRA-LISTA IDAG:
// [x] 1. Skapa Katt med namn, ras och chipnummer
// [x] 2. Gör kattens fält private och skapa getters
// [x] 3. Skapa KattHotell med en privat lista av katter
// [x] 4. Skapa metod för att checka in en katt
// [x] 5. Stoppa katter med samma chipnummer
// [x] 6. Skapa metod som listar alla katter
// [x] 7. Visa meddelande om hotellet är tomt

// NYA PUNKTER FÖR PASS 2:
// [x] 7. Göra så att hotellet kan leta upp en katt på namn (eller svara tomt om den saknas)
// [ ] 8. Bygga meny-loopen som snurrar med Scanner tills vi väljer att avsluta
// [ ] 9. Koppla ihop val 1-4 med hotellet (och skydda sökningen i val 3 mot krasch med en grindvakt)

public class Main {
    public static void main(String[] args) {
        KattHotell hotell = new KattHotell();

        hotell.laggTill(new Katt("Bosse", 101, "Siames"));
        hotell.laggTill(new Katt("Luna", 102, "Ragdoll"));
        hotell.laggTill(new Katt("Sara", 101, "Sara"));

        System.out.println("Antal: " + hotell.antalKatter());

        hotell.listaAlla();
    }
}