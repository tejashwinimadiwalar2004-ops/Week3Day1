public class Bounds {
    public static void main(String[] args) {
        try {
            int[] arr = {10,20,30,40,50};
            System.out.println(arr[7]);


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something went wrong");
        }
    }
}
