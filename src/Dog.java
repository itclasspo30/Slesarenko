public class Dog extends Animal {

    public Dog(int type, String name, String color, String food, int age, String sex, String owner, String comment) {
        super(type, name, color, food, age, sex, owner, comment);
    }

    @Override
    public void sayHello() {
        System.out.println("Woof Woof");
    }
}
