public class Categorie {
    String nume;
    int tip;

    public Categorie(String nume, int tip) {
        this.nume = nume;
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "nume='" + nume + '\'' +
                ", tip=" + tip +
                '}';
    }
}
