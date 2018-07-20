package purchases;

import products.Product;

public class Purchase {
    Product product;
    int count;

    public Purchase(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    public int getCost(){
        return count*product.getCost();
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "product=" + product +
                ", count=" + count +
                '}';
    }
}
