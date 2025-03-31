import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (town.equals("Sofia")) {
            price = switch (product) {
                case "coffee" -> quantity * 0.5;
                case "water" -> quantity * 0.8;
                case "beer" -> quantity * 1.2;
                case "sweets" -> quantity * 1.45;
                case "peanuts" -> quantity * 1.60;
                default -> price;
            };
        } else if (town.equals("Plovdiv")) {
            price = switch (product) {
                case "coffee" -> quantity * 0.4;
                case "water" -> quantity * 0.7;
                case "beer" -> quantity * 1.15;
                case "sweets" -> quantity * 1.30;
                case "peanuts" -> quantity * 1.50;
                default -> price;
            };
        } else if (town.equals("Varna")) {
            price = switch (product) {
                case "coffee" -> quantity * 0.45;
                case "water" -> quantity * 0.7;
                case "beer" -> quantity * 1.1;
                case "sweets" -> quantity * 1.35;
                case "peanuts" -> quantity * 1.55;
                default -> price;
            };
        }

        System.out.println(price);
    }
}