import java.util.Scanner;
public class calculator {
    public static void main(String arg[]) {
        System.out.println("----Basic Calculator----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        float a = sc.nextInt();
        System.out.println("Enter Second number: ");
        float b = sc.nextInt();

        while (true) {
            System.out.println("1.Addition.");
            System.out.println("2.Subtraction.");
            System.out.println("3.Multiplication.");
            System.out.println("4.Division.");
            System.out.println("5.Exit.");
            System.out.println("Chose any one for Operation from (1~5): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Addition is: " + (a + b));
                    break;
                case 2:
                    System.out.println("Subtraction is: " + (a - b));
                    break;
                case 3:
                    System.out.println("Multiplication is: " + (a * b));
                    break;
                case 4:
                    try {
                        float result = a / b;
                        System.out.println("Division is: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: Can't divide by zero!...");
                        System.out.println("Exception details: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Exited from Calculator.");
                    sc.close();
                    return;
                default:
                    System.out.println("Incorrect Entry...");
                    break;
            }
        }
    }
}