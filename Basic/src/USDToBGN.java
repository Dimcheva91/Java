import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bgn = Double.parseDouble(scanner.nextLine());

        System.out.println(bgn * 1.79549);
    }
}
