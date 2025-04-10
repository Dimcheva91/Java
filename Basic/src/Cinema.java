import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cinema = scanner.nextLine();
        double rows = Double.parseDouble(scanner.nextLine());
        double colums = Double.parseDouble(scanner.nextLine());

        double price = 0;

//        if (cinema.equals("Premiere"))   {
//            price = (colums * rows) * 12;
//            System.out.printf("%.2f", price);
//        } else if (cinema.equals("Normal")) {
//            price = (rows * colums) * 7.5;
//            System.out.printf("%.2f leva", price);
//        } else if (cinema.equals("Discout")) {
//            price = (rows * colums) * 5.;
//            System.out.printf("%.2f leva", price);

        if (cinema.equals("Premiere")) {
            price = (colums * rows) * 12;
            System.out.printf("%.2f" , price);
            System.out.println(" leva");
        } else if (cinema.equals("Normal")) {
            price = (colums * rows) * 7.5;
            System.out.printf("%.2f", price);
            System.out.println(" leva");
        } else if (cinema.equals("Discount")) {
            price = (colums * rows) * 5;
            System.out.printf("%.2f", price);
            System.out.println(" leva");

        }
    }
}

