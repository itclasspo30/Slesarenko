package products;

public class TeaFactory extends ProductFactory {

    @Override
    public Product createProduct(String name, int cost) {
        return new Tea(name, cost);
    }
}
