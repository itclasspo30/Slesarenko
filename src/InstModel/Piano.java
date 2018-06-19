package InstModel;

public class Piano extends Instrument implements Soudable, Fireable {
    @Override
    public String doSound() {
        return "Tin-tin-tin";
    }

    @Override
    public int getTimeOfFire() {
        return 30;
    }
}
