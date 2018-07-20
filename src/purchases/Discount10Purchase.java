package purchases;

import products.Product;

public class Discount10Purchase extends Purchase{

    public Discount10Purchase(Product product, int count) {
        super(product, count);
    }

    @Override
    public int getCost() {
        return (int) (0.9*super.getCost());
    }
}
