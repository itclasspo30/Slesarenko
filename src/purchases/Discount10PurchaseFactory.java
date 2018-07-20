package purchases;

import products.Product;

public class Discount10PurchaseFactory extends PurchasesFactory{

    @Override
    public Purchase createPurchase(Product product, int count) {
        return new Discount10Purchase(product, count);
    }
}
