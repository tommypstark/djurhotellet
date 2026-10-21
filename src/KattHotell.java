import java.util.ArrayList;
import java.util.List;

public class KattHotell {
    private List<Katt> katter = new ArrayList<>();

    public boolean laggTill(Katt katt) {
        if (finns(katt.getChipnummer())) {
            System.out.println("Katt med detta chipnummer finns redan.");
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
            System.out.println("Inga katter är incheckade.");
        } else {
            for (Katt katt : katter) {
                System.out.println(katt.getNamn() + " " + katt.getChipnummer() + " " + katt.getRas());
            }
        }
    }
}