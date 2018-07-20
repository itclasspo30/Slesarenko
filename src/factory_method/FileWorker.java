package factory_method;

import products.CoffeeFactory;
import products.Product;
import products.TeaFactory;
import purchases.Discount10PurchaseFactory;
import purchases.Discount25PurchaseFactory;
import purchases.Purchase;
import purchases.PurchaseFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileWorker {

    private static final String FILENAME = "src\\purchases.txt";

    public static ArrayList<Purchase> purchases = new ArrayList<>();

    public static CoffeeFactory coffeeFactory = new CoffeeFactory();
    public static TeaFactory teaFactory = new TeaFactory();
    public static PurchaseFactory purchaseFactory = new PurchaseFactory();
    public static Discount10PurchaseFactory discount10PurchaseFactory = new Discount10PurchaseFactory();
    public static Discount25PurchaseFactory discount25PurchaseFactory = new Discount25PurchaseFactory();

    public ArrayList<Purchase> parseFile(){

        BufferedReader br = null;

        Purchase curPurchase = null;
        Product curProduct = null;

        try {
            br = new BufferedReader(new FileReader(FILENAME));
            String line = br.readLine();

            while (line != null) {
                String[] values = line.split(" ");

                switch (values[0]){
                    case "coffee": curProduct= coffeeFactory.getProduct(values[1],
                            Integer.parseInt(values[2]));
                        break;
                    case "tea": curProduct= teaFactory.getProduct(values[1],
                            Integer.parseInt(values[2]));
                        break;
                }

                switch (values[3]){
                    case "d0": curPurchase=purchaseFactory.createPurchase(curProduct,
                            Integer.parseInt(values[4]));
                        break;
                    case "d10": curPurchase=discount10PurchaseFactory.createPurchase(curProduct,
                            Integer.parseInt(values[4]));
                        break;
                    case "d25": curPurchase=discount25PurchaseFactory.createPurchase(curProduct,
                            Integer.parseInt(values[4]));
                        break;
                }
                purchases.add(curPurchase);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return purchases;
    }

}
