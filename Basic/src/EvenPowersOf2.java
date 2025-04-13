import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <= number; index +=2) {
            System.out.printf("%.0f%n", Math.pow(2, index));
        }
    }
}
