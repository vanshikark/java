import java.util.Scanner;
public class exception3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);

        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("hiiiiiiiiiiiiiiii");
    }
}

    

