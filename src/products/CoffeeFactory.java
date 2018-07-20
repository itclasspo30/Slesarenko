package products;

public class CoffeeFactory extends ProductFactory {

    @Override
    public Product createProduct(String name, int cost) {
        return new Coffee(name, cost);
    }
}
