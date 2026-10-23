// MIN ATT-GÖRA-LISTA IDAG:
// [x] 1. Skapa Katt med namn, ras och chipnummer
// [x] 2. Gör kattens fält private och skapa getters
// [x] 3. Skapa KattHotell med en privat lista av katter
// [x] 4. Skapa metod för att checka in en katt
// [x] 5. Stoppa katter med samma chipnummer
// [x] 6. Skapa metod som listar alla katter
// [x] 7. Visa meddelande om hotellet är tomt

// NYA PUNKTER FÖR PASS 2:
// [x] 8. Göra så att hotellet kan leta upp en katt på namn (eller svara tomt om den saknas)
// [x] 9. Bygga meny-loopen som snurrar med Scanner tills vi väljer att avsluta
// [x] 10. Koppla ihop val 1-4 med hotellet (och skydda sökningen i val 3 mot krasch med en grindvakt)

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KattHotell hotell = new KattHotell();
        int val = 0;

        while (val != 7) {
            System.out.println("\n*** KATTHOTELLET 1.0 ***");
            System.out.println("1. Checka in katt.\n2. Lista alla incheckade katter.\n3. Sök katt på namn\n4. Checka ut katt\n5. Sök katter efter ras\n6. Töm hotellet\n7. Avsluta");
            System.out.print("Välj: ");
            val = scanner.nextInt();
            scanner.nextLine(); // Rensar bort den tomma raden

            switch (val) {
                case 1 -> {
                    System.out.print("\nSkriv kattens namn: ");
                    String name = scanner.nextLine();
                    System.out.print("Skriv kattens chip-nummer: ");
                    int num = scanner.nextInt();
                    scanner.nextLine(); // Rensar bort den tomma raden
                    System.out.print("Skriv kattens ras: ");
                    String race = scanner.nextLine();
                    hotell.laggTill(new Katt(name, num, race));
                }
                case 2 -> hotell.listaAlla();
                case 3 -> {
                    System.out.print("\nSkriv kattens namn: ");
                    String name = scanner.nextLine();
                    Katt hittad = hotell.hittaNamn(name);
                    if (hittad != null) {
                        System.out.println("\nKatt hittad:");
                        System.out.println("Namn: " + hittad.getNamn() + "\nChip-nummer: " + hittad.getChipnummer() + "\nRas: " + hittad.getRas());
                    } else {
                        System.out.println("\nIngen katt med det namnet är incheckad här.");
                    }
                }
                case 4 -> {
                    System.out.print("\nAnge chip-nummer för utcheckning: ");
                    int chipnummer = scanner.nextInt();
                    scanner.nextLine();
                    if (hotell.checkaUt(chipnummer)) {
                        System.out.println("Utcheckningen lyckades!");
                    } else {
                        System.out.println("\nDet finns ingen katt med det chip-numret.");
                    }
                }
                case 5 -> {
                    System.out.print("\nSkriv vilken ras: ");
                    String ras = scanner.nextLine();
                    List<Katt> traffar = hotell.hittaRas(ras);
                    if (traffar.isEmpty()) {
                        System.out.println("\nInga katter av den rasen hittades.");
                    } else {
                        for (Katt k : traffar) {
                            System.out.println("\nNamn: " + k.getNamn() + "\nChip-nummer: " + k.getChipnummer() + "\nRas: " + k.getRas());
                        }
                    }
                }
                case 6 -> {
                    //Töm hotellet
                }
                case 7 -> System.out.println("Avslutar programmet. Välkommen åter!");
                default -> System.out.println("Ogiltigt val, försök igen.");
            }
        }
    }
}