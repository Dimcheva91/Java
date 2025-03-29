import java.util.Scanner;

public class SuppliesForSchool {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         double pricePence = 5.8;
         double priceMarkers = 7.2;
         double pricePreparation = 1.2;

         double pence = Double.parseDouble(scanner.nextLine());
         double markers = Double.parseDouble(scanner.nextLine());
         double preparation = Double.parseDouble(scanner.nextLine());
         double percent = Double.parseDouble((scanner.nextLine()));

         double totalPricePence = pence * pricePence;
         double totalPriceMarkers = markers * priceMarkers;
         double totalPricePreparation = preparation * pricePreparation;

         double totalPrice = totalPricePence + totalPriceMarkers + totalPricePreparation;
         double priceWithPercent = totalPrice - (totalPrice * (percent / 100));

         System.out.println(priceWithPercent);
         }
}
