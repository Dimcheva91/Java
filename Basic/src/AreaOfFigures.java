import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        if (command.equals("square")) {
            double num1 = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", num1 * num1);
        } else if (command.equals("rectangle")) {
            double num1 = Double.parseDouble(scanner.nextLine());
            double num2 = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", num1 * num2);
        } else if (command.equals("circle")) {
            double num1 = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f",Math.PI * (num1 * num1));
        } else if (command.equals("triangle")) {
            double num1 = Double.parseDouble(scanner.nextLine());
            double num2 = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (num1 * num2) / 2);
        }
    }
}
