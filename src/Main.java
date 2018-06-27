public class Main {

    public static void main(String[] args) {
        String baseString = new String("Василий съел мороженое и поправился на 20 грамм");

        String[] arrStr;
        String delimeter = " ";
        arrStr = baseString.split(delimeter);

        int i = 0;
        while (i < arrStr.length){
            String upperString = arrStr[i].toUpperCase();
            System.out.println(upperString);
            i++;
            System.out.println(arrStr[i]);
            i++;
        }
    }
}
