public abstract class CarPlatform implements  CarPart {
    String name;

    public CarPlatform(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CarPlatform{" +
                "name='" + name + '\'' +
                '}';
    }
}
