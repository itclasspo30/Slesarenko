public class Main {

    public static void main(String[] args) {

        Purchase[] purchases = new Purchase[5];

        purchases[0] = new Purchase(new GrantaPlatform(), new HP86EngineComplectFactory(), true, true, false);
        purchases[1] = new Purchase(new GrantaPlatform(), new HP108EngineComplectFactory(), true, true, true);
        purchases[2] = new Purchase(new VestaPlatform(), new HP108EngineComplectFactory(), true, false, false);
        purchases[3] = new Purchase(new VestaPlatform(), new HP122EngineComplectFactory(), true, true, true);
        purchases[4] = new Purchase(new GrantaPlatform(), new HP122EngineComplectFactory(), false, false, false);

        int sumCost = 0;
        for (Purchase purchase:purchases) {
            sumCost += purchase.getCost();
            System.out.println(purchase.toString());
        }

        System.out.println("Total cost of all purchases: "+sumCost);
    }
}
