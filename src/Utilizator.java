import java.util.ArrayList;
import java.util.List;

public class Utilizator {
    String nume;
    String parola;
    boolean logat;
    Outh autentificare;
    String email;
    List<Produs> listaProduse = new ArrayList<Produs>();

    public boolean Logare(String nume, String parola){
        if(nume == this.nume && parola == (this).parola){
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
}
