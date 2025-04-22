import java.util.Scanner;

public class CleverLily {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ageLilly = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());

        double toyCount = 0;
        double savedMoney = 0;
        int moneyGift = 10;
        double brotherTaken = 0;

        for (int index = 1; index <= ageLilly; index++) {

            if (index % 2 == 0) {
                savedMoney += moneyGift;
                moneyGift += 10;
                brotherTaken++;
            } else {
             toyCount++;
            }
        }
      double toyMoney = toyCount * toyPrice;
        savedMoney = savedMoney + toyMoney - brotherTaken;

        if(savedMoney >= washingMachinePrice) {
            System.out.printf("Yes! %.2f%n", savedMoney - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f%n", washingMachinePrice - savedMoney);
        }
    }
}
