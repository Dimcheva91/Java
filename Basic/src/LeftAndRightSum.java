import java.util.Scanner;

public class LeftAndRightSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int index = 1; index <= number; index++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            leftSum += currentNumber;
        }
        for (int index = 1; index <= number; index++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            rightSum += currentNumber;
        }
        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = " + rightSum);
        } else {
            int difference = Math.abs(rightSum - leftSum);
            System.out.printf("No, diff = " + difference);
        }
    }
}
