import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = null;
        try {
            in = new Scanner(new File("src/list.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<Cat> catList = new ArrayList<>();
        String[] catOptions = new String[5];

        while (in.hasNext()){
            catOptions = (in.nextLine()).split(" ");
            Cat curCat = new Cat(catOptions[0], catOptions[1], Double.parseDouble(catOptions[2]), catOptions[3], catOptions[4]);
            catList.add(curCat);
        }

        //Сортировка листа
        Collections.sort(catList);

        //Вывод черных
        System.out.println("Вывод черных");
        for(Cat cat:catList){
            if((cat.getColor().equals("black")))
                System.out.println(cat.toString());
        }

        //Удаление голубых
        int index = -1;
        while (index < 0){

            for(Cat cat:catList){
                if((cat.getColorEye().equals("blue")))
                    index = catList.indexOf(cat);
            }

            if (index > 0){
                catList.remove(index);
                System.out.println("Кот удален");
            }

            for(Cat cat:catList){
                if((cat.getColorEye().equals("blue")))
                    index = -1;
            }
        }

        //Просмотр оставшихся
        System.out.println("Просмотр оставшихся");
        for(Cat cat:catList){
            System.out.println(cat.toString());
        }


    }
}
