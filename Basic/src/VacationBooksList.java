import java.util.Scanner;

public class VacationBooksList {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int countPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int countDays = Integer.parseInt(scanner.nextLine());

        int totalHours = countPages / pagesPerHour;
        int hoursPerDays = totalHours / countDays;

         System.out.println(hoursPerDays);
         }
}
