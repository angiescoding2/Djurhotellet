import java.util.ArrayList;
import java.util.List;

public class KattHotell {

    private List<Katt> katter = new ArrayList<>();

    public void checkaIn(Katt katt) {
        if (finnsChipnummer(katt.getChipnummer())) {
            System.out.println("Varning! Chipnumret finns redan.");
            return;
        }

        katter.add(katt);
    }
  public boolean finnsChipnummer(int chipnummer) {
    for (Katt befintligKatt : katter) {
    if (befintligKatt.getChipnummer() == chipnummer) {
    return true;
    }
    }
    return false;
  }
  public int antalKatter() {
        return katter.size();

  }
}