package factory_method;
import purchases.Purchase;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Purchase> purchases;

    public static void main(String[] args) {

        Scanner choice = new Scanner(System.in);

        System.out.print("Choose the source (1 - file, 2 - console): ");

        switch (choice.next()){
            case "1":
                FileWorker curFileWorker = new FileWorker();
                purchases = curFileWorker.parseFile();
                break;

            case "2":
                ConsoleWorker curConsoleWorker = new ConsoleWorker();
                purchases = curConsoleWorker.parseConsole();
                break;
        }

        for (Purchase purchase:purchases) {
            System.out.println(purchase);
        }

        int s=0;
        for (Purchase purchase:purchases) {
            s+=purchase.getCost();
        }
        System.out.print("Total cost of purchases: ");
        System.out.println(s);
    }
}
