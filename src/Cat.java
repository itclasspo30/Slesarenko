public class Cat implements Comparable<Cat> {

    private String name;
    private String type;
    private double weight;
    private String color;
    private String colorEye;

    public Cat(String name, String type, double weight, String color, String colorEye) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.color = color;
        this.colorEye = colorEye;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getColorEye() {
        return colorEye;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", weight='" + weight + '\'' +
                ", color='" + color + '\'' +
                ", colorEye='" + colorEye + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return (int)(this.weight - o.weight);
    }
}
