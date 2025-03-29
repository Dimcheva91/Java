import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());

        double shooses = price * 0.6;
        double clouts = shooses * 0.8;
        double ball = clouts / 4;
        double other = ball / 5;

        double total =price + shooses + clouts + ball + other;

        System.out.println(total);
    }
}
