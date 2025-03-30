import java.util.Scanner;

public class ToyShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double vacationPrice = Double.parseDouble(scanner.nextLine());

        int countPuzzle = Integer.parseInt(scanner.nextLine());
        int countTalkingDoll = Integer.parseInt(scanner.nextLine());
        int countTeddyBear = Integer.parseInt(scanner.nextLine());
        int countMinions = Integer.parseInt(scanner.nextLine());
        int countToyTruck = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = 2.60;
        double talkingDollPrice = 3.00;
        double teddyBearPrice = 4.10;
        double minionsPrice = 8.20;
        double toyTruckPrice = 2.00;

        double totalPrice = (countPuzzle * puzzlePrice) +
                (countTalkingDoll * talkingDollPrice) +
                (countTeddyBear * teddyBearPrice) +
                (countMinions * minionsPrice) +
                (countToyTruck * toyTruckPrice);

        int totalToys = countPuzzle + countTalkingDoll + countTeddyBear + countMinions + countToyTruck;

        // Apply discount if more than 50 toys are sold
        if (totalToys >= 50) {
            totalPrice = totalPrice * 0.75;  // 25% discount
        }

        // Rent deduction of 10%
        double rent = totalPrice * 0.10;
        double profit = totalPrice - rent;

        // Calculate whether the profit is enough for the vacation
        double neededMoney = vacationPrice - profit;

        if (profit >= vacationPrice) {
            System.out.printf("Yes! %.2f lv left.", Math.abs(neededMoney));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(neededMoney));
        }
    }
}

