import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        double quantityOfDays = Double.parseDouble(scanner.nextLine());

        double studio = 0;
        double apartment = 0;
        double priceStudio = 0;
        double priceApartment = 0;

        switch (month) {
            case "May":
            case "October":
                studio = 50;
                apartment = 65;
                priceStudio = studio * quantityOfDays;
                priceApartment = apartment * quantityOfDays;

                if (quantityOfDays > 14) {
                    priceStudio *= 0.70;
                    priceApartment *= 0.90;
                } else if (quantityOfDays > 7) {
                    priceStudio *= 0.95;
                }
                break;

            case "June":
            case "September":
                studio = 75.2;
                apartment = 68.7;
                priceStudio = studio * quantityOfDays;
                priceApartment = apartment * quantityOfDays;

                if (quantityOfDays > 14) {
                    priceStudio *= 0.80;
                    priceApartment *= 0.90;
                }
                break;

            case "July":
            case "August":
                studio = 76;
                apartment = 77;
                priceStudio = studio * quantityOfDays;
                priceApartment = apartment * quantityOfDays;

                if (quantityOfDays > 14) {
                    priceApartment *= 0.90;
                }
                break;
        }

        System.out.printf("Apartment: %.2f lv.%n", priceApartment);
        System.out.printf("Studio: %.2f lv.%n", priceStudio);
    }
}
