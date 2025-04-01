import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String days = scanner.nextLine();

        int price = switch (days) {
            case "Monday" -> 12;
            case "Tuesday" -> 12;
            case "Wednesday" -> 14;
            case "Thursday" -> 14;
            case "Friday" -> 12;
            case "Saturday" -> 16;
            case "Sunday" -> 16;
            default -> 0;
        };

        System.out.println(price);
    }
}
