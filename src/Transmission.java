public abstract class Transmission implements CarPart {
    NameTransmission nameTransmission;
    TypeTransmission typeTransmission;

    public Transmission(NameTransmission nameTransmission, TypeTransmission typeTransmission) {
        this.nameTransmission = nameTransmission;
        this.typeTransmission = typeTransmission;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "nameTransmission=" + nameTransmission +
                ", typeTransmission=" + typeTransmission +
                '}';
    }
}
