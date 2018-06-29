public class Main {

    public static void main(String[] args) {
        String baseString = new String("В январе средняя температура минус два градуса");

        String[] arrStr;
        String delimeter = " ";
        arrStr = baseString.split(delimeter);

        for(int i = 0; i < arrStr.length; i++){
            if(arrStr[i].length()<=5)
                System.out.println(arrStr[i]);

        }
    }
}
