public class Main {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[5];
        int sum = 0;

        System.arraycopy(a, 5, b, 0, 5);

        for(int i=0; i<5; i++){
            sum = sum + b[i];
        }

        System.out.println(sum);
    }
}
