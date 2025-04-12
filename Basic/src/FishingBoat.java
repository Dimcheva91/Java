import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double fishman = Double.parseDouble(scanner.nextLine());

        double rentPrice = 0;

        switch (season) {
            case "Spring":
                rentPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                rentPrice = 4200;
                break;
            case "Winter":
                rentPrice = 2600;
                break;
        }

        if (fishman <= 6) {
            rentPrice *= 0.9;
        } else if (fishman >= 7 && fishman <= 11) {
            rentPrice *= 0.85;
        } else if (fishman > 12) {
            rentPrice *= 0.75;
        }

        if (fishman % 2 == 0 && !season.equals("Autumn")) {
            rentPrice *= 0.95;
        }

        double neededMoney = Math.abs(budget - rentPrice);

        if (budget >= rentPrice) {
            System.out.printf("Yes! You have %.2f leva left.%n", neededMoney);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.%n", neededMoney);
        }
    }
}
