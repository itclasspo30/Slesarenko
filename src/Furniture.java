public class Furniture {
    private String name;
    private double cost;
    private String wood;

    static double sumCost = 0;
    static int sumQuant = 0;

    public Furniture(String name, double cost, String wood) {
        this.name = name;
        this.cost = cost;
        this.wood = wood;

        sumQuant++;
        sumCost += cost;
    }

    public static double getMediCost(){
        return sumCost / sumQuant;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public String getWood() {
        return wood;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", wood='" + wood + '\'' +
                '}';
    }
}
