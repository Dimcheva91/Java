import java.util.Scanner;

public class HalfSumElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantityNumber = Integer.parseInt(scanner.nextLine());

        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int index = 1; index <= quantityNumber; index++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;

            if(currentNumber >maxNumber) {
                maxNumber = currentNumber;
            }
        }

        int sumWithoutMaxNumber = sum - maxNumber;

        if(maxNumber == sumWithoutMaxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = "  + maxNumber);
        } else {
            int diff = Math.abs(sumWithoutMaxNumber - maxNumber);
            System.out.println("No");
            System.out.printf("Diff = "  + diff);
        }
    }
}
