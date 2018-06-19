public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRADIUS() {
        return radius;
    }

    public void setRADIUS(double RADIUS) {
        this.radius = RADIUS;
    }

    @Override
    public double getSquare() {
        return 3.14*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle RADIUS=" + radius;
    }
}