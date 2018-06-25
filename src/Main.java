public class Main {

    public static void main(String[] args) {

        Thing[] things = new Thing[10];
        things[0] = new Thing(Thing.Material.COTTON, Thing.Size.XS, Thing.Color.BLACK, "Prod_1", 100);
        things[1] = new Thing(Thing.Material.WOOD, Thing.Size.S, Thing.Color.RED, "Prod_2", 100);
        things[2] = new Thing(Thing.Material.PLASTIC, Thing.Size.M, Thing.Color.WHITE, "Prod_3", 100);
        things[3] = new Thing(Thing.Material.GLASS, Thing.Size.L, Thing.Color.BLACK, "Prod_4", 100);
        things[4] = new Thing(Thing.Material.COTTON, Thing.Size.XL, Thing.Color.RED, "Prod_5", 100);
        things[5] = new Thing(Thing.Material.WOOD, Thing.Size.XXL, Thing.Color.WHITE, "Prod_1", 100);
        things[6] = new Thing(Thing.Material.WOOD, Thing.Size.XS, Thing.Color.BLACK, "Prod_2", 100);
        things[7] = new Thing(Thing.Material.COTTON, Thing.Size.XXL, Thing.Color.RED, "Prod_3", 100);
        things[8] = new Thing(Thing.Material.COTTON, Thing.Size.XXL, Thing.Color.WHITE, "Prod_4", 100);
        things[9] = new Thing(Thing.Material.WOOD, Thing.Size.M, Thing.Color.BLACK, "Prod_5", 100);

        for(Thing thing:things)
            System.out.println(thing.toString());

        System.out.println("---");

        for(Thing thing:things)
            if(thing.material.equals(Thing.Material.COTTON))
            System.out.println(thing.toString());

        System.out.println("---");

        for(Thing thing:things)
            if(thing.size.equals(Thing.Size.XXL))
                System.out.println(thing.toString());

    }
}
