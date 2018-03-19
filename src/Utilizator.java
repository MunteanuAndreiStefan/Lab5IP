import java.util.ArrayList;
import java.util.List;

public class Utilizator {
    private String nume;
    private String parola;
    private boolean logat;
    private Outh autentificare;
    private String email;
    private List<Produs> listaProduse = new ArrayList<Produs>();

    public boolean Logare(String nume, String parola){
        if(nume.equals(this.nume) && parola.equals((this).parola)){
            logat = true;
        }
        return(logat);
    }

    public boolean Logout(){
        if(logat){
            logat = false;
        }
        return logat;
    }
    public boolean adaugaProdus(Produs produs){
           listaProduse.add(produs);
           return true;
    }

    public Outh getAutentificare()
    {
        return autentificare;
    }

    public void setAutentificare(Outh autentificare)
    {
        this.autentificare = autentificare;
    }
}

