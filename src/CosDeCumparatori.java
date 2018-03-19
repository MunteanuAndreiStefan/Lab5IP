import java.util.ArrayList;
import java.util.List;

public class CosDeCumparatori {
    List<Comandaprodus> listaProduse = new ArrayList<>();
    Starecomanda stareComanda;

    public float calculeazaTotal(){
        return (0);
    }

    public boolean faComanda(modDePlata mod){
        return(false);
    }

    public boolean anuleazaComanda(){
        if(stareComanda.tip == "inprogres"){
            stareComanda.tip = "anulat";
            return(true);
        }
        return(false);
    }
}
