package purchases;

import products.Product;

public class PurchaseFactory extends PurchasesFactory{

    @Override
    public Purchase createPurchase(Product product, int count) {
        return new Purchase(product, count);
    }
}
