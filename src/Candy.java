public class Candy {

    @Override
    public String toString() {
        return "Конфета{" +
                "Название " + name +
                ", вес " + weight +
                ", производитель " + producer +
                ", тип " + type +
                '}';
    }

    String name;
    int weight;
    String producer;
    Type type;

    public static enum Type{
        CARAMEL, CHOCOLATE, ON_STICK
    }

    class Producer{
        String nameProducer;
        public Producer (Type type){
            if (type == Type.CARAMEL)
                nameProducer = "Spartak";

            if (type == Type.CHOCOLATE)
                nameProducer = "Komunarka";

            if (type == Type.ON_STICK)
                nameProducer = "Cupa-Chups";
        }

        public String getNameProducer(){
            return nameProducer;
        }
    }

    public Candy (String name, int weight, Type type) {
        Producer producer = new Producer(type);

        this.name = name;
        this.weight = weight;
        this.type = type;
        this.producer = producer.getNameProducer();

    }
}
