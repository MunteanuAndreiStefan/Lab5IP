public class Tara {
    private String nume;

    public Tara(String nume, int id)
    {
        this.nume = nume;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tara{" +
                "nume='" + nume + '\'' +
                ", id=" + id +
                '}';
    }

    private int id;

    public String getNume()
    {
        return nume;
    }

    public int getId()
    {
        return id;
    }
}
