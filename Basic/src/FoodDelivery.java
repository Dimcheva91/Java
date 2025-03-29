import java.util.Scanner;

public class FoodDelivery {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         double chickenMenu = 10.35;
         double fishMenu = 12.4;
         double veganMenu = 8.15;
         double delivery = 2.5;

         double chicken = Double.parseDouble(scanner.nextLine());
         double fish = Double.parseDouble(scanner.nextLine());
         double vegan = Double.parseDouble(scanner.nextLine());

         double price = ((chicken * chickenMenu) + (fish * fishMenu) + (vegan * veganMenu));
         double desert = price * 0.2;
         double totalPrice = price + desert + delivery;

         System.out.println(totalPrice);
         }
}
