import java.util.Scanner;

public class AccountBalance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double totalMoney = 0;

        while (!command.equals("NoMoreMoney"))
        {
            double currentAmount = Double.parseDouble(command);

            if (currentAmount < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            totalMoney += currentAmount;
            System.out.printf("Increase: %.2f%n", currentAmount);
            command = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalMoney);

    }
}
