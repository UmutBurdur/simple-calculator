import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int selection;
        double num1,num2,result;

        Scanner number = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = number.nextInt();
        System.out.print("Enter second number: ");
        num2 = number.nextInt();

        System.out.println("-Choose your arithmetical operation- \n1-Addition\n2-Abstraction\n3-Multiplication\n" +
                "4-Division");
        System.out.print("Selection: ");
        selection = number.nextInt();

        switch (selection) {
            case 1:
                result = num1 + num2;
                System.out.println("Result is " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Result is " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Result is " + result);
                break;

            case 4:
                if (num2!=0) {
                    result = num1 / num2;
                    System.out.println("Result is " + result);
                }
                else {
                    System.out.println("You cannot divide a number with 0! Infinity?!");
                }
                break;

            default:
                System.out.println("Incorrect selection.Please select a number between 1 and 4!");
        }
    }
}
