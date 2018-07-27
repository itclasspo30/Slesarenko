public class ZfTransmission extends Transmission {

    public ZfTransmission() {
        super(NameTransmission.ZF, TypeTransmission.ROBOT);
    }

    @Override
    public int getCost() {
        return 900;
    }
}
