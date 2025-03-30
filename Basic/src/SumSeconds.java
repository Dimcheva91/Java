import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPerson = Integer.parseInt(scanner.nextLine());
        int secondPerson = Integer.parseInt(scanner.nextLine());
        int thirdPerson = Integer.parseInt(scanner.nextLine());

        int totalTime = firstPerson + secondPerson + thirdPerson;

        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        if (seconds < 10) {
            System.out.printf("%s:0%d", minutes, seconds);
        }
        else {
            System.out.printf("%s:%d", minutes, seconds);
        }
    }
}
