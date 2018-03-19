public class Comandaprodus {
    int cantitate;
    int idProdus;

    public Comandaprodus(int cantitate, int idProdus) {
        this.cantitate = cantitate;
        this.idProdus = idProdus;
    }

    @Override
    public String toString() {
        return "Comandaprodus{" +
                "cantitate=" + cantitate +
                ", idProdus=" + idProdus +
                '}';
    }
}
