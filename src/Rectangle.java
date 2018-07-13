public class Rectangle {
    private String name;
    private double side1;
    private double side2;

    public String getName() {
        return name;
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }


    Rectangle(String name, double side1, double side2){
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
    }

    double getSquare()throws NegativeSideException{
        if((side1 <= 0 & side2 > 0) || (side2 <= 0 & side1 > 0))
            throw new NegativeSideException(this.name, 0);

        if(side1 <= 0 & side2 <= 0)
            throw new NegativeSideException(this.name, 0, 0);

        return side1*side2;

    }
}
