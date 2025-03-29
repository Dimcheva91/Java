import java.util.Scanner;

public class PetShop {
     public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     double foodDog = Double.parseDouble(scanner.nextLine());
     double foodCat = Double.parseDouble(scanner.nextLine());
     double priceDog = 2.5;
     double priceCat = 4;

     double totalDog = foodDog * priceDog;
     double totalCat = foodCat * priceCat;
     double total = totalDog + totalCat;

     System.out.printf("%s lv.", total);
     }
}
