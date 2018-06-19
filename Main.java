import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private static String prevailingDogColor;
    private static String prevailingCatColor;
    private static String prevailingBirdColor;

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(new File("src/pets.txt"));

        int count = scanner.nextInt();
        Animal[] animals = new Animal[count];

        for(int i=0; i<count; i++) {

            int sw = scanner.nextInt();
            switch (sw) {
                case 1:
                    animals[i]=new Dog(1, scanner.next(), scanner.next(), scanner.next(),
                            scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
                    break;
                case 2:
                    animals[i]=new Cat(2, scanner.next(), scanner.next(), scanner.next(),
                            scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
                    break;
                case 3:
                    animals[i]=new Bird(3, scanner.next(), scanner.next(), scanner.next(),
                            scanner.nextInt(), scanner.next(), scanner.next(), scanner.next());
                    break;
                default:
                    System.out.println("Wrong pet type");
                    break;
            }
        }
            scanner.close();

        /*
        //Проверка чтения из файла
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
        */
            int curentType; //обрабатываемый тип животного

            String curentColor;  //рассматриваемый цвет животного
            int curentFreque;  //найденное количество повторений по текущему цвету

            //максимальное число повторений цвета по каждому виду
            int dogFreque = 0;
            int catFreque = 0;
            int birdFreque = 0;

            //перебор каждого животного в массиве,
            // определение его вида, отыскание оставшихся сородичей,
            // сравнение их цветов и подсчет совпадений
            for (int i=0; i<count; i++) {
                curentType = animals[i].getType();

                switch (curentType){
                    case 1:
                        curentColor = animals[i].getColor();
                        curentFreque = 0;
                        for (int j = i + 1; j < count; j++) {
                            if (animals[j].getType() == 1) {
                                if (curentColor.equals(animals[j].getColor())) {
                                    curentFreque++;
                                }
                            }
                        }
                        if (curentFreque > dogFreque) {
                            dogFreque = curentFreque;
                            prevailingDogColor = curentColor;
                        }
                        break;

                    case 2:
                        curentColor = animals[i].getColor();
                        curentFreque = 0;
                        for (int j = i + 1; j < count; j++) {
                            if (animals[j].getType() == 2) {
                                if (curentColor.equals(animals[j].getColor())) {
                                    curentFreque++;
                                }
                            }
                        }
                        if (curentFreque > catFreque) {
                            catFreque = curentFreque;
                            prevailingCatColor = curentColor;
                        }
                        break;

                    case 3:
                        curentColor = animals[i].getColor();
                        curentFreque = 0;
                        for (int j = i + 1; j < count; j++) {
                            if (animals[j].getType() == 3) {
                                if (curentColor.equals(animals[j].getColor())) {
                                    curentFreque++;
                                }
                            }
                        }
                        if (curentFreque > birdFreque) {
                            birdFreque = curentFreque;
                            prevailingBirdColor = curentColor;
                        }
                        break;
                }
            }

            System.out.println("#1");
            System.out.println("Prevailing Dog Color: "+prevailingDogColor);
            System.out.println("Prevailing Cat Color: "+prevailingCatColor);
            System.out.println("Prevailing Bird Color: "+prevailingBirdColor);


            //вывод животных по указанному владельцу
            System.out.println("#2");
            Scanner in = new Scanner(System.in);
            System.out.print("Please, insert Owner Name: ");
            String ownerName = in.next();

            System.out.print(ownerName + "'s pets: ");
            for (Animal animal:animals){
                if (animal.getOwner().equals(ownerName)) {
                    System.out.print(animal.getName()+" ");
                }
            }


            //вывод животных по видам
            System.out.println("\n"+"#3");
            System.out.print("Dogs: ");
            for (Animal animal:animals){
                if (animal.getType()==1) {
                    System.out.print(animal.getName()+" ");
                }
            }
            System.out.print("\n"+"Cats: ");
            for (Animal animal:animals){
                if (animal.getType()==2) {
                    System.out.print(animal.getName()+" ");
                }
            }
            System.out.print("\n"+"Birds: ");
            for (Animal animal:animals){
                if (animal.getType()==3) {
                    System.out.print(animal.getName()+" ");
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}