import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        switch (command) {
            case "square" -> {
                double num1 = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.3f", num1 * num1);
            }
            case "rectangle" -> {
                double num1 = Double.parseDouble(scanner.nextLine());
                double num2 = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.3f", num1 * num2);
            }
            case "circle" -> {
                double num1 = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.3f", Math.PI * (num1 * num1));
            }
            case "triangle" -> {
                double num1 = Double.parseDouble(scanner.nextLine());
                double num2 = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.3f", (num1 * num2) / 2);
            }
        }
    }
}
