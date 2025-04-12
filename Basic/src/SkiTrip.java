import java.util.Scanner;

public class SkiTrip {
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         double days = (Double.parseDouble(scanner.nextLine()) - 1);
        String roomType = scanner.nextLine();
        String feedback = scanner.nextLine();

        double roomForOnePersonPrice = 18;
        double apartmentPrice = 25;
        double presidentApartmentPrice = 35;

        double totalRoomForOnePersonPrice = roomForOnePersonPrice * days;
        double totalApartmentPricePrice = apartmentPrice * days;
        double totalPresidentApartmentPricePrice = presidentApartmentPrice * days;

        switch (roomType) {
            case "room for one person":
                if(feedback.equals("positive")) {
                    System.out.printf("%.2f", totalRoomForOnePersonPrice * 1.25);
                } else {
                    System.out.printf("%.2f", totalRoomForOnePersonPrice * 0.9);
                }
                break;
            case "apartment":
                if(days <= 10) {
                    totalApartmentPricePrice *= 0.7;
                } else if (days > 10 && days <= 15) {
                    totalApartmentPricePrice *= .65;
                } else {
                    totalApartmentPricePrice *= .5;
                }
                if(feedback.equals("positive")) {
                    System.out.printf("%.2f", totalApartmentPricePrice * 1.25);
                } else {
                    System.out.printf("%.2f", totalApartmentPricePrice * 0.9);
                }
                break;
            case "president apartment":
                if(days <= 10) {
                    totalPresidentApartmentPricePrice *= 0.9;
                } else if (days > 10 && days <= 15) {
                    totalPresidentApartmentPricePrice *= .85;
                } else {
                    totalPresidentApartmentPricePrice *= .8;
                }
                if(feedback.equals("positive")) {
                    System.out.printf("%.2f", totalPresidentApartmentPricePrice * 1.25);
                } else {
                    System.out.printf("%.2f", totalPresidentApartmentPricePrice * 0.9);
                }
                break;
        }
     }
}
