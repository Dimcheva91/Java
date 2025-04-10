import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cinema = scanner.nextLine();
        double rows = Double.parseDouble(scanner.nextLine());
        double colums = Double.parseDouble(scanner.nextLine());

        double price = Double.parseDouble(scanner.nextLine());

        price = switch (cinema) {
            case "Premiere" -> rows * colums * 12;
            case "Normal" -> rows * colums * 7.5;
            case "Discount" -> rows * colums * 5;
            default -> price;
        };

        System.out.printf("%.2f leva", price);
    }
}

