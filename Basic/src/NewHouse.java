import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String flowers = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());


        double rosesPrice = 5;
        double dahliasPrice = 3.8;
        double tulipsPrice = 2.8;
        double narcissusPrice = 3;
        double gladiolusPrice = 2.5;

        double price = 0;

        if (flowers.equals("Roses")) {
            if (quantity > 80) {
                price = (quantity * rosesPrice) * 0.90;
            } else {
                price = quantity * rosesPrice;
            }
        } else if (flowers.equals("Dahlias")) {
            if (quantity > 90) {
                price = (quantity * dahliasPrice) * 0.85;
            } else {
                price = quantity * dahliasPrice;
            }
        } else if (flowers.equals("Tulips")) {
            if (quantity > 80) {
                price = (quantity * tulipsPrice) * 0.85;
            } else {
                price = quantity * tulipsPrice;
            }
        } else if (flowers.equals("Narcissus")) {
            if (quantity < 120) {
                price = (quantity * narcissusPrice) * 1.15;
            } else {
                price = quantity * narcissusPrice;
            }
        } else if (flowers.equals("Gladiolus")) {
            if (quantity < 80) {
                price = (quantity * gladiolusPrice) * 1.2;
            } else {
                price = quantity * gladiolusPrice;
            }
        }
        if (price > budget) {
            double neededMoney = Math.abs(price - budget);
            System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
        } else {
            double leftMoney = Math.abs(budget - price);
            System.out.printf("Hey, you have a great garden with %.0f %s and %.2f leva left.", quantity, flowers,
                    leftMoney);
        }
    }
}
