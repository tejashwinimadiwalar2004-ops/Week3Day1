


public class Handle {
    public static void main(String[] args) {
        String value = "abc";
        
        try {
        int num= Integer.parseInt(value);
 System.out.println(num);
            
        } catch (NumberFormatException e) {
           System.out.println("Invalid number format");
        }
    }
}
