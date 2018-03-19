public class modDePlata {
    private int tip;

    public modDePlata(int tip)
    {
        this.tip = tip;
    }

    public modDePlata() {

    }

    public int getTip()
    {
        return tip;
    }

    @Override
    public String toString() {
        return "modDePlata{" +
                "tip=" + tip +
                '}';
    }
}
