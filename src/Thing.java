import java.util.Objects;

public class Thing {

    public static class Producer{
        private String name;

        public Producer(String name){
            this.name = name;
        }

        private String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Producer{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    enum Material {
        COTTON, WOOD, PLASTIC, GLASS
    }

    enum Size {
        XS, S, M, L, XL, XXL
    }

    enum Color {
        RED, BLACK, WHITE
    }

    Material material;
    Size size;
    Color color;
    Producer producer;
    double cost;

    public Thing(Material material, Size size, Color color, String nameProducer, double cost){
        this.material = material;
        this.size = size;
        this.color = color;
        this.producer = new Producer(nameProducer);
        this.cost = cost;
        if (this.color.equals(Color.RED))
            this.cost = 0.5*cost;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "material=" + material +
                ", size=" + size +
                ", color=" + color +
                ", producer=" + producer.toString() +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Double.compare(thing.cost, cost) == 0 &&
                material == thing.material &&
                size == thing.size &&
                color == thing.color &&
                Objects.equals(producer, thing.producer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(material, size, color, producer, cost);
    }
}
