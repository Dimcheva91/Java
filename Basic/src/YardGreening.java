import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int area = Integer.parseInt(scanner.nextLine());

        double price = 7.61;
        double totalArea = area * price;
        double discount = totalArea * 0.18;
        double total = totalArea - discount;

        System.out.printf("The final price is: %s lv.", total);
        System.out.printf("The discount is: %s lv.", discount);
    }
}
