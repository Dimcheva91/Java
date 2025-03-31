import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardsQuantity = Integer.parseInt(scanner.nextLine());
        int cpuQuantity = Integer.parseInt(scanner.nextLine());
        int ramQuantity = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = 250 * videoCardsQuantity;
        double cpuPrice = (videoCardPrice * 0.35) * cpuQuantity;
        double ramPrice = (videoCardPrice * 0.1) * ramQuantity;

        double totalPrice = videoCardPrice + cpuPrice + ramPrice;

        if (videoCardsQuantity > cpuQuantity) {
            totalPrice = totalPrice * 0.85;
        }

        if (budget >= totalPrice) {
        double neededPrice = budget - totalPrice;
            System.out.printf("You have %.2f leva left!", neededPrice);
        } else {
            double neededPrice = totalPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", neededPrice);
        }
    }
}
