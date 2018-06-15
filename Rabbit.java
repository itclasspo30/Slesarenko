import java.util.Objects;

public class Rabbit {

    private String name;
    private int weight;
    private String eyeColor;
    private String woolColor;
    private static double mediWeight;


    public Rabbit (String name, int weight, String eyeColor, String woolColor){
        this.name = name;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.woolColor = woolColor;
    }

    public Rabbit (Rabbit clon){
        this(clon.getName(), clon.getWeight(), clon.getEyeColor(), clon.getWoolColor());

    }

    public static double getMediWeight (Rabbit rOne, Rabbit rTwo){
        mediWeight = (rOne.getWeight()+rTwo.getWeight())/2;
        return mediWeight;
    }

    @Override
    public String toString() {
        return "Rabbit{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", eyeColor='" + eyeColor + '\'' +
                ", woolColor='" + woolColor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rabbit rabbit = (Rabbit) o;
        return weight == rabbit.weight &&
                Objects.equals(name, rabbit.name) &&
                Objects.equals(eyeColor, rabbit.eyeColor) &&
                Objects.equals(woolColor, rabbit.woolColor);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, weight, eyeColor, woolColor);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getWoolColor() {
        return woolColor;
    }

    public void setWoolColor(String woolColor) {
        this.woolColor = woolColor;
    }

}
