package InstModel;

public class Balalaika extends Instrument implements Soudable, Fireable  {
    @Override
    public String doSound() {
        return "Tril-tril-tryam";
    }

    @Override
    public int getTimeOfFire() {
        return 7;
    }
}
