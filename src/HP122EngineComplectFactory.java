public class HP122EngineComplectFactory implements EngineComplectFactory {
    @Override
    public Engine getEngine() {
        return new Vaz22016Engine();
    }

    @Override
    public Transmission getTransmission() {
        return new ZfTransmission();
    }
}
