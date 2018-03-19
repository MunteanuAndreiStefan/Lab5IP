import java.util.Date;

public class Perisabil {
    private Date dataExpirare;

    public Perisabil(Date dataExpirare)
    {
        this.dataExpirare = dataExpirare;
    }

    public Date getDataExpirare()
    {
        return dataExpirare;
    }
}
