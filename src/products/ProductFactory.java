package products;

import java.util.ArrayList;

public abstract class ProductFactory {

    ArrayList<Product> products = new ArrayList<>();

    public Product getProduct(String name, int cost){
        Product newProduct = createProduct(name, cost);

        if (products.contains(newProduct)){
            return products.get(products.indexOf(newProduct));
        }
        else {
            products.add(newProduct);
            return newProduct;
        }

    }

    public abstract Product createProduct(String name, int cost);
}
