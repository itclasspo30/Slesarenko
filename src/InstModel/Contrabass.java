package InstModel;

public class Contrabass extends Instrument implements Soudable, Fireable  {
    @Override
    public String doSound() {
        return "Zzzou-zzou-zoof";
    }

    @Override
    public int getTimeOfFire() {
        return 15;
    }
}
