
import java.util.Scanner;

public class Finale {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        try {
            System.out.println("Enter first element");
            int res1 = sc.nextInt();

            System.out.println("Enter second element");
            int res2 = sc.nextInt();

            int result = res1/res2;
            System.out.println("Result : " +result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot be divided by zero");
        }
        finally{
            System.out.println("Program Executed");
        }
        sc.close();
    }
}
