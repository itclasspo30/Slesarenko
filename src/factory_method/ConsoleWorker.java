package factory_method;

import products.CoffeeFactory;
import products.Product;
import products.TeaFactory;
import purchases.Discount10PurchaseFactory;
import purchases.Discount25PurchaseFactory;
import purchases.Purchase;
import purchases.PurchaseFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleWorker {

    Purchase curPurchase = null;
    Product curProduct = null;
    String curDrink;
    String curSort;
    String curCost;
    String curDiscount;
    String curQuantity;

    public static ArrayList<Purchase> purchases = new ArrayList<>();

    public static CoffeeFactory coffeeFactory = new CoffeeFactory();
    public static TeaFactory teaFactory = new TeaFactory();
    public static PurchaseFactory purchaseFactory = new PurchaseFactory();
    public static Discount10PurchaseFactory discount10PurchaseFactory = new Discount10PurchaseFactory();
    public static Discount25PurchaseFactory discount25PurchaseFactory = new Discount25PurchaseFactory();

    public ArrayList<Purchase> parseConsole() {

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a drink (coffee/tea): ");
            curDrink = input.next();

            System.out.print("Enter sort of the drink: ");
            curSort = input.next();

            System.out.print("Enter cost of the drink: ");
            curCost = input.next();

            switch (curDrink) {
                case "coffee":
                    curProduct = coffeeFactory.getProduct(curSort,
                            Integer.parseInt(curCost));
                    break;
                case "tea":
                    curProduct = teaFactory.getProduct(curSort,
                            Integer.parseInt(curCost));
                    break;
            }

            System.out.print("Enter discount (0/10/25): ");
            curDiscount = input.next();

            System.out.print("Enter quantity: ");
            curQuantity = input.next();

            switch (curDiscount) {
                case "0":
                    curPurchase = purchaseFactory.createPurchase(curProduct,
                            Integer.parseInt(curQuantity));
                    break;
                case "10":
                    curPurchase = discount10PurchaseFactory.createPurchase(curProduct,
                            Integer.parseInt(curQuantity));
                    break;
                case "25":
                    curPurchase = discount25PurchaseFactory.createPurchase(curProduct,
                            Integer.parseInt(curQuantity));
                    break;
            }
            purchases.add(curPurchase);

            System.out.print("One more drink? (y/n): ");

        } while (input.next().equalsIgnoreCase("y"));

        return purchases;
    }
}
