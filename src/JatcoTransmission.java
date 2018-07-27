public class JatcoTransmission extends Transmission {

    public JatcoTransmission() {
        super(NameTransmission.JATCO, TypeTransmission.AUTO);
    }

    @Override
    public int getCost() {
        return 750;
    }
}
