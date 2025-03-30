import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = minutes + 15;

        if (totalMinutes >= 60) {
            hours += 1;
        }
        if (hours >= 24) {
            hours = 0;
        }
        int minutesAfterCalculating = totalMinutes % 60;

        if (minutesAfterCalculating < 10) {
            System.out.printf("%d:0%d", hours, minutesAfterCalculating);
        } else {
            System.out.printf("%d:%d", hours, minutesAfterCalculating);
        }
    }
}
