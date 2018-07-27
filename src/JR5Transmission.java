public class JR5Transmission extends Transmission {

    public JR5Transmission() {
        super(NameTransmission.JR5, TypeTransmission.MANUAL);
    }

    @Override
    public int getCost() {
        return 500;
    }
}
