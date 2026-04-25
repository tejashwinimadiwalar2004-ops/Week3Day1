public class Multiple {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int res = a/b;

            int[] arr = {10,20,30,40};
            System.out.println(arr[5]);


        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e ) {

            System.out.println("Exception handled:" +e);
        }
    }
}
