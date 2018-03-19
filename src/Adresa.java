import java.util.Date;

public class Adresa {
    int id;
    Date deLaData;
    Date panaLaData;
    Codpostal codPostal;
    int tipAdresa;

    public Adresa(int id, Date deLaData, Date panaLaData, Codpostal codPostal, int tipAdresa) {
        this.id = id;
        this.deLaData = deLaData;
        this.panaLaData = panaLaData;
        this.codPostal = codPostal;
        this.tipAdresa = tipAdresa;
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "id=" + id +
                ", deLaData=" + deLaData +
                ", panaLaData=" + panaLaData +
                ", codPostal=" + codPostal +
                ", tipAdresa=" + tipAdresa +
                '}';
    }
}
