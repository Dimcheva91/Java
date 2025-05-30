import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int index = 1; index <= number; index++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber < 200) {
                p1++;
            } else if (currentNumber >= 200 && currentNumber <= 399) {
                p2++;
            } else if (currentNumber >= 400 && currentNumber <= 599) {
                p3++;
            } else if (currentNumber >= 600 && currentNumber <= 799) {
                p4++;
            } else {
                p5++;
            }
        }

        System.out.printf("%.2f%%%n", p1 * 100 / number);
        System.out.printf("%.2f%%%n", p2 * 100 / number);
        System.out.printf("%.2f%%%n", p3 * 100 / number);
        System.out.printf("%.2f%%%n", p4 * 100 / number);
        System.out.printf("%.2f%%%n", p5 * 100 / number);
    }
}
