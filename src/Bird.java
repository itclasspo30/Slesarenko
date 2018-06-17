public class Bird extends Animal {

    public Bird(int type, String name, String color, String food, int age, String sex, String owner, String comment) {
        super(type, name, color, food, age, sex, owner, comment);
    }

    @Override
    public void sayHello() {
        System.out.println("Piu Piu Blya");
    }
}
