import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        double timeSeries = Double.parseDouble(scanner.nextLine());
        double timeForBreakfast = Double.parseDouble(scanner.nextLine());

        double lunchTime = timeForBreakfast / 8;
        double freeTime = timeForBreakfast / 4;
        double leaveTime = timeForBreakfast - (lunchTime + freeTime);

        if (leaveTime >= timeSeries) {
            double leftTime = leaveTime - timeSeries;
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName,
                    Math.ceil(leftTime));
        } else {
            double leftTime = timeSeries - leaveTime;
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName,
                    Math.ceil(leftTime));
        }
    }
}
