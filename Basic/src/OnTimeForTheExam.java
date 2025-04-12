import java.util.Scanner;

public class OnTimeForTheExam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        int examTimeMinutes = (examHour * 60) + examMinutes;
        int arriveTimeMinutes = (arriveHour * 60) + arriveMinutes;

        if ((arriveTimeMinutes > examTimeMinutes)) {
            System.out.println("Late");
            int lateMinutes = arriveTimeMinutes - examTimeMinutes;
            if(lateMinutes < 60) {
                System.out.printf("%d minutes after the start", lateMinutes);
            } else {
                int hour = lateMinutes / 60;
                int minutes = lateMinutes % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }
            //on time   10:10      9:25
        } else if ((arriveMinutes == examTimeMinutes || examTimeMinutes - arriveTimeMinutes <= 30)) {
            System.out.println("On time");
            if (examTimeMinutes - arriveTimeMinutes <= 30 && arriveTimeMinutes != examTimeMinutes) {
                System.out.printf("%d minutes before the start", examTimeMinutes - arriveTimeMinutes);
            }
            //early
        } else if (examTimeMinutes - arriveTimeMinutes > 30) {
            System.out.println("Early");
            int earlyMinutes = examTimeMinutes - arriveTimeMinutes;
            if(earlyMinutes <60) {
                System.out.printf("%d minutes before the start", earlyMinutes);
            } else {
                int hour = earlyMinutes / 60;
                int minutes = earlyMinutes % 60;
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            }
        }
    }
}
