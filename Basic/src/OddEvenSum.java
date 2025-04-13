import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int evenSum = 0;
        int oddSum = 0;

        for (int index = 1; index <= number; index++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (index % 2 == 0) {
                evenSum += currentNumber;
            } else {
                oddSum += currentNumber;
            }
        }
        if (evenSum == oddSum) {
            System.out.println("Yes");
            System.out.printf("Sum = " + evenSum);
        } else {
            int diff = Math.abs(evenSum - oddSum);
            System.out.println("No");
            System.out.printf("Diff = " + diff);
        }
    }
}
