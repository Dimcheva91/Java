import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double singlePriceNylon = 1.5;
        double singlePricePaint = 14.5;
        double singlePricePaintThinner = 5;
        double bag = 0.4;

        double nylon = Double.parseDouble(scanner.nextLine());
        double paint = Double.parseDouble(scanner.nextLine());
        double paintThinner = Double.parseDouble(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double priceNylon = (nylon + 2) * singlePriceNylon;
        double pricePaint = (paint * 1.1) * singlePricePaint;
        double pricePaintThinner = paintThinner * singlePricePaintThinner;

        double totalSumMaterials = priceNylon + pricePaint + pricePaintThinner + bag;
        double workman = (totalSumMaterials * 0.3) * hours;
        double totalSum = totalSumMaterials + workman;

        System.out.println(totalSum);
    }
}
