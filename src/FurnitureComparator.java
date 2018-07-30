import java.util.Comparator;

public class FurnitureComparator implements Comparator<Furniture> {
    @Override
    public int compare(Furniture f1, Furniture f2) {
        return (int)(f1.getCost() - f2.getCost());
    }
}
