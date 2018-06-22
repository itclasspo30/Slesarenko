public class Main {

    public static void main(String[] args) {

        Candy[] candies = new Candy[3];
        candies[0] = new Candy("Polet", 100, Candy.Type.CHOCOLATE);
        candies[1] = new Candy("Govno", 130, Candy.Type.ON_STICK);
        candies[2] = new Candy("Skazka", 90, Candy.Type.CARAMEL);

        for (Candy candy:candies){
            System.out.println(candy.toString());
        }
    }
}
