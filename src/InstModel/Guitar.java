package InstModel;

public class Guitar extends Instrument  implements Soudable, Fireable{
    @Override
    public String doSound() {
        return "Trun-trun-trun";
    }

    @Override
    public int getTimeOfFire() {
        return 10;
    }
}
