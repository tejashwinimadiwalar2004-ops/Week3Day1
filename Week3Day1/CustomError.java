
import java.util.Scanner;

public class CustomError {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter first element");
            int sum1 = sc.nextInt();

            System.out.println("Enter second element");
            int sum2 = sc.nextInt();

            int result = sum1/sum2;
            System.out.println("Result :" +result);

        } catch (ArithmeticException e) {

            System.out.println("Error:division by zero is not allowed");
        }
    }
}
