import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degrees = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();
        String outfit = "";
        String shoes = "";

//        if (day.equals("Morning")) {
//            if (degrees >= 10 && degrees <= 18) {
//                outfit = "Sweatshirt";
//                shoes = "Sneakers";
//            } else if (degrees > 18 && degrees <= 24) {
//                outfit = "Shirt";
//                shoes = "Moccasins";
//            } else if (degrees >= 25) {
//                outfit = "T-Shirt";
//                shoes = "Sandals";
//            }
//            System.out.printf("It's %.0f degrees, get your %s and %s.", degrees, outfit, shoes);
//        } else if (day.equals("Afternoon")) {
//            if (degrees >= 10 && degrees <= 18) {
//                outfit = "Shirt";
//                shoes = "Moccasins";
//            } else if (degrees > 18 && degrees <= 24) {
//                outfit = "T-Shirt";
//                shoes = "Sandals";
//            } else if (degrees >= 25) {
//                outfit = "Swim Suit";
//                shoes = "Barefoot";
//            }
//            System.out.printf("It's %.0f degrees, get your %s and %s.", degrees, outfit, shoes);
//        } else if (day.equals("Evening")) {
//            if (degrees >= 10 && degrees <= 18) {
//                outfit = "Shirt";
//                shoes = "Moccasins";
//            } else if (degrees > 18 && degrees <= 24) {
//                outfit = "Shirt";
//                shoes = "Moccasins";
//            } else if (degrees >= 25) {
//                outfit = "Shirt";
//                shoes = "Moccasins";
//            }
//            System.out.printf("It's %.0f degrees, get your %s and %s.", degrees, outfit, shoes);
//        }


        switch (day) {
            case "Morning":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (degrees > 18 && degrees <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                System.out.printf("It's %.0f degrees, get your %s and %s.", degrees, outfit, shoes);
                break;
            case "Afternoon":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees > 18 && degrees <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (degrees >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                System.out.printf("It's %.0f degrees, get your %s and %s.", degrees, outfit, shoes);
                break;
            case "Evening":
                if (degrees >= 10 && degrees <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees > 18 && degrees <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degrees >= 25) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                System.out.printf("It's %.0f degrees, get your %s and %s.", degrees, outfit, shoes);
                break;
        }
    }
}