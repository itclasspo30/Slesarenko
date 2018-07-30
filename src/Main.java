import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(new File("src/list.txt"));


            List<Furniture> furnList = new LinkedList<>();
            String[] curFurn = new String[3];

            while (in.hasNext()){
                curFurn = (in.nextLine()).split(" ");
                furnList.add(new Furniture(curFurn[0], Double.parseDouble(curFurn[1]), curFurn[2]));
            }

            Collections.sort(furnList, new FurnitureComparator());
            System.out.println("Удаляем позицию с наименьшей стоимостью.");
            System.out.println("После сортировки она первая в списке:");
            System.out.println((furnList.get(0)).toString()+" - удалена");
            furnList.remove(0);

            System.out.println("Оставшиеся позиции:");
            for (Furniture furniture:furnList){
                System.out.println(furniture.toString());
            }

            System.out.print("Средняя стоимость мебели: ");
            System.out.println(Furniture.getMediCost());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }












    }
}
