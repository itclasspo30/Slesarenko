public class Main {

    public static void main(String[] args) {

        Rabbit origin = new Rabbit("Jo", 3, "blue", "white");
        Rabbit clon = new Rabbit(origin);

        clon.setWeight(6);

        System.out.println(origin.toString());
        System.out.println(clon.toString());
        System.out.println("MediWeight="+Rabbit.getMediWeight(origin, clon));
    }
}
