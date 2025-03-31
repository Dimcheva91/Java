import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordToSeconds = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double swimmingTime = distance * time;
        double delly = Math.floor(distance / 15) * 12.5;

        double totalSwimTime = swimmingTime + delly;

        if (recordToSeconds > totalSwimTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalSwimTime);
        } else {
            double leftTime = totalSwimTime - recordToSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", leftTime);
        }
    }
}
