import java.util.Scanner;

public class TennisRanklist {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputCountTurners = Integer.parseInt(scanner.nextLine());
        double pointsInRankList = Double.parseDouble(scanner.nextLine());

        double pointsFromTournaments = 0;
        double winsCount = 0;

        for (int index = 1; index <= inputCountTurners; index++) {

            String currentCompetitionType = scanner.nextLine();

            switch (currentCompetitionType) {
                case "W":
                    pointsFromTournaments += 2000;
                    winsCount++;
                    break;
                case "F":
                    pointsFromTournaments += 1200;
                    break;
                case "SF":
                    pointsFromTournaments += 720;
                    break;
            }
        }
        double averagePoints = Math.floor(pointsFromTournaments / inputCountTurners);
        double finalPoints =  Math.round(pointsFromTournaments + pointsInRankList);

        System.out.printf("Final points: %.0f%n", finalPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%%n", (winsCount / inputCountTurners) * 100);
    }
}
