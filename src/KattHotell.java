import java.util.ArrayList;
import java.util.List;

public class KattHotell {
    private List<Katt> katter = new ArrayList<>();

    public boolean laggTill(Katt katt) {
        if (finns(katt.getChipnummer())) {
            System.out.println("Katt med detta chip-nummer finns redan.");
            return false;
        }

        katter.add(katt);
        return true;
    }

    public boolean finns(int chipnummer) {
        for (Katt katt : katter) {
            if (katt.getChipnummer() == chipnummer) {
                return true;
            }
        }

        return false;
    }

    public int antalKatter() {
        return katter.size();
    }

    public void listaAlla() {
        if (katter.isEmpty()) {
            System.out.println("\nInga katter är incheckade!");
        } else {
            for (Katt k : katter) {
                System.out.println("\nNamn: " + k.getNamn() + "\nChip-nummer: " + k.getChipnummer() + "\nRas: " + k.getRas());
            }
        }
    }

    public Katt hittaNamn(String namn) {
        for (Katt k : katter) {
            if (k.getNamn().equalsIgnoreCase(namn)) {
                return k; // Träff: lämna över katten och avbryt metoden direkt!
            }
        }
        return null;
    }

    public boolean checkaUt(int chipnummer) {
        for (Katt k : katter) {
            if (k.getChipnummer() == chipnummer) {
                katter.remove(k);
                return true;
            }
        }
        return false;
    }

    public List<Katt> hittaRas(String ras) {
        List<Katt> traffar = new ArrayList<>();
        for (Katt k : katter) {
            if (k.getRas().equalsIgnoreCase(ras)) {
                traffar.add(k);
            }
        }
        return traffar;
    }

    public void clearAll() {
        katter.clear();
    }

}