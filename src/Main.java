public class Main {

    public static void main(String[] args) {

        Rectangle[] recArr = new Rectangle[5];

        recArr[0] = new Rectangle("one", 5, 2);
        recArr[1] = new Rectangle("two", 0, 4);
        recArr[2] = new Rectangle("three", -5, -2);
        recArr[3] = new Rectangle("four", 4, 0);
        recArr[4] = new Rectangle("five", 8, 3);

        for(Rectangle rectangle : recArr){
            try {
                System.out.println("Square of rectengle "+rectangle.getName()+" is "+rectangle.getSquare());
            } catch (NegativeSideException e) {
                System.out.println(e.toString());
            }
        }
    }
}
