public class Codpostal {
    int id;
    Tara tara;

    public Codpostal(int id, Tara tara) {
        this.id = id;
        this.tara = tara;
    }

    @Override
    public String toString() {
        return "Codpostal{" +
                "id=" + id +
                ", tara=" + tara +
                '}';
    }
}
