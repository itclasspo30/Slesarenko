package FurModel;

public abstract class Furniture implements Colorable {
    public String name;

    public Furniture(String name){
        this.name = name;
    }

    public abstract double getCostDiscount();

}
