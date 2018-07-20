package purchases;

import products.Product;

public class Discount25Purchase extends Purchase {

    public Discount25Purchase(Product product, int count) {
        super(product, count);
    }

    @Override
    public int getCost() {
        return (int)(0.75*super.getCost());
    }
}
