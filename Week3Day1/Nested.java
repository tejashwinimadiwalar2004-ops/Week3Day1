public class Nested {
    public static void main(String[] args) {
        try {
            System.out.println("Result is good");

            try {
                System.out.println("Try block");
            } catch (Exception e) {
                System.out.println("Catch Exception");
            }
            
        } catch (Exception e) {
            System.out.println("Exception occured");
        }
    }
}
