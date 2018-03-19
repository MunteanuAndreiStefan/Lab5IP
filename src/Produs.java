import java.util.ArrayList;
import java.util.List;

public class Produs {
    List<Comentariu> list = new ArrayList<Comentariu>();
    private int idProdus;
    private Categorie categorie;
    private float pret;

    @Override
    public String toString() {
        return "Produs{" +
                "list=" + list +
                ", idProdus=" + idProdus +
                ", categorie=" + categorie +
                ", pret=" + pret +
                '}';
    }

    public Produs(int idProdus, Categorie categorie, float pret)
    {
        this.idProdus = idProdus;
        this.categorie = categorie;
        this.pret = pret;
    }

    public void adaugaComentariu(Comentariu comentariu)
    {
        list.add(comentariu);
    }


    public int getIdProdus()
    {
        return idProdus;
    }

    public Categorie getCategorie()
    {
        return categorie;
    }

    public float getPret()
    {
        return pret;
    }
}

