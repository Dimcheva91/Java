import java.util.Scanner;

public class Oscars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        double quantityJury = Double.parseDouble(scanner.nextLine());

        double countPoints = 0;

        for (int index = 1; index <= quantityJury; index++) {

            String juryName = scanner.nextLine();
            double pointsFromJury = Double.parseDouble(scanner.nextLine());

            countPoints = (academyPoints + (juryName.length() * pointsFromJury) / 2);
            academyPoints = +countPoints;

            if (academyPoints >= 1250.5) {
                break;
            }
        }

        if (countPoints < 1250.5) {
            double neededPoints = 1250.5 - countPoints;
            System.out.printf("Sorry, %s you need %.1f more!", actorName, neededPoints);
        } else {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, countPoints);
        }
    }
}
