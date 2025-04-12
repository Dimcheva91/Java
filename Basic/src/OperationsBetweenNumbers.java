import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        String operation = scanner.nextLine();

        double num3 = 0;

        switch (operation) {
            case "+":
                num3 = num1 + num2;
                if (num3 % 2 == 0) {
                    System.out.printf("%.0f %s %.0f = %.0f - even", num1, operation, num2, num3);
                } else {
                    System.out.printf("%.0f %s %.0f = %.0f - odd", num1, operation, num2, num3);
                }
                break;
            case "-":
                num3 = num1 - num2;
                if (num3 % 2 == 0) {
                    System.out.printf("%.0f %s %.0f = %.0f - even", num1, operation, num2, num3);
                } else {
                    System.out.printf("%.0f %s %.0f = %.0f - odd", num1, operation, num2, num3);
                }
                break;
            case "*":
                num3 = num1 * num2;
                if (num3 % 2 == 0) {
                    System.out.printf("%.0f %s %.0f = %.0f - even", num1, operation, num2, num3);
                } else {
                    System.out.printf("%.0f %s %.0f = %.0f - odd", num1, operation, num2, num3);
                }
                break;
            case "/":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero", num1);
                } else {
                    num3 = num1 / num2;
                    System.out.printf("%.0f %s %.0f = %.2f", num1, operation, num2, num3);
                }
                break;
            case "%":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero", num1);
                } else {
                    num3 = num1 % num2;
                    System.out.printf("%.0f %s %.0f = %.0f", num1, operation, num2, num3);
                }
        }
    }
}