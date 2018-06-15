import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[9];

        figures[0]=new Rectangle(5, 4);
        figures[1]=new Circle(7);
        figures[2]=new Triangle(7, 9);
        figures[3]=new Rectangle(3, 5);
        figures[4]=new Circle(9);
        figures[5]=new Triangle(2, 8);
        figures[6]=new Rectangle(6, 8);
        figures[7]=new Circle(4);
        figures[8]=new Triangle(7, 3);

        double sumSquare = 0;
        double minSquare = figures[0].getSquare();
        double maxSquare = figures[0].getSquare();

        for (Figure figure : figures){
            System.out.print(figure.toString()+"   ");
            System.out.println(figure.getSquare());
            sumSquare = sumSquare + figure.getSquare();
            if (minSquare > figure.getSquare()){
                minSquare = figure.getSquare();
            }

            if (maxSquare < figure.getSquare()){
                maxSquare = figure.getSquare();
            }
        }
        System.out.println("Общая площадь="+sumSquare);
        System.out.println("Минимальная площадь="+minSquare);
        System.out.println("Максимальная площадь="+maxSquare);

    }
}
