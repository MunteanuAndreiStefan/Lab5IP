import java.util.ArrayList;
import java.util.List;

public class CosDeCumparaturi {
    List<Comandaprodus> listaProduse = new ArrayList<>();
    Starecomanda stareComanda;

    public CosDeCumparaturi() {
        this.listaProduse = listaProduse;
        this.stareComanda = stareComanda;
    }

    public float calculeazaTotal(){
        return (0);
    }

    public boolean faComanda(modDePlata mod){
        return(false);
    }

    public boolean anuleazaComanda(){
        if(stareComanda.getTip() == "inprogres"){
            stareComanda.tip = "anulat";
            return(true);
        }
        return(false);
    }

    @Override
    public String toString() {
        return "CosDeCumparaturi{" +
                "listaProduse=" + listaProduse +
                ", stareComanda=" + stareComanda +
                '}';
    }
}
