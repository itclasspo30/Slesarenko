public class Rectangle extends Figure {

    private double len_X;
    private double len_Y;

    public Rectangle(double len_x, double len_y) {
        len_X = len_x;
        len_Y = len_y;
    }

    public double getLEN_X() {
        return len_X;
    }

    public void setLEN_X(double LEN_X) {
        this.len_X = LEN_X;
    }

    public double getLEN_Y() {
        return len_Y;
    }

    public void setLEN_Y(double LEN_Y) {
        this.len_Y = LEN_Y;
    }

    @Override
    public double getSquare() {
        return len_X*len_Y;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "LEN_X=" + len_X +
                ", LEN_Y=" + len_Y +
                '}';
    }
}