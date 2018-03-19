public class Comentariu{
    String detinator;
    String mesaj;
    int idComentariu;
    int rating;

    public Comentariu(String detinator, String mesaj, int idComentariu, int rating) {
        this.detinator = detinator;
        this.mesaj = mesaj;
        this.idComentariu = idComentariu;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Comentariu{" +
                "detinator='" + detinator + '\'' +
                ", mesaj='" + mesaj + '\'' +
                ", idComentariu=" + idComentariu +
                ", rating=" + rating +
                '}';
    }
}
