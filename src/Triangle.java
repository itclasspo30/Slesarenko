public class Triangle extends Figure {

    private double hight;
    private double lenght;

    public Triangle (double hight, double lenght){
        this.hight = hight;
        this.lenght = lenght;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getSquare() {
        return (hight*lenght)/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "hight=" + hight +
                ", lenght=" + lenght +
                '}';
    }
}