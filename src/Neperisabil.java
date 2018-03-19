import java.util.Date;

public class Neperisabil {
    private Date garantie;

    @Override
    public String toString() {
        return "Neperisabil{" +
                "garantie=" + garantie +
                '}';
    }

    public Neperisabil(Date garantie)
    {
        this.garantie = garantie;
    }

    public Date getGarantie()
    {
        return garantie;
    }
}
