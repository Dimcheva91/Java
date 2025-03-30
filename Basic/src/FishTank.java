import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = length * width * height;
        double volumeLiter = volume / 1000;
        double liter = volumeLiter * (1 - (percent / 100));

        System.out.println(liter);
    }
}
