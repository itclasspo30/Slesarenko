package purchases;

import products.Product;

public abstract class PurchasesFactory {

    public abstract Purchase createPurchase(Product product, int count);
}
