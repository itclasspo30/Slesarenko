import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String baseString = "съешь же еще этих мягких французских булок да выпей чаю";

        char startChar = 'а';

        Map<Character, Integer> abc = new HashMap<Character, Integer>();

        char[] strToArray = baseString.toCharArray();


        for(int i = 0; i < 32; i++){
            abc.put((char) (startChar+i), 0);
        }
        //System.out.println(strToArray[2]);

        int counter;
        for(int i = 0; i < strToArray.length; i++){

            if(abc.get( (Character) strToArray[i]) != null){
                counter = (int) abc.get( (Character) strToArray[i]);
                //System.out.println("c1-"+counter);
                counter++;
                //System.out.println("c2-"+counter);
                abc.put(strToArray[i], (Integer) counter);
            }

        }

        Set set = abc.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + "-" + me.getValue()+ "  " );
        }

    }
}
