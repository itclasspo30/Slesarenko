package purchases;

import products.Product;

public class Discount25PurchaseFactory extends PurchasesFactory{

    @Override
    public Purchase createPurchase(Product product, int count) {
        return new Discount25Purchase(product, count);
    }
}
