package InstModel;

public class Violin extends Instrument implements Soudable, Fireable  {
    @Override
    public String doSound() {
        return "Siuu-siiiuuu-syaaa";
    }

    @Override
    public int getTimeOfFire() {
        return 5;
    }
}
