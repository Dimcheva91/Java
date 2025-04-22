import java.util.Scanner;

public class Oscars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        double quantityJury = Double.parseDouble(scanner.nextLine());

        double maxPoints = 1250.5;

        double countPoints = 0;

        for (int index = 1; index <= quantityJury; index++) {

            String juryName = scanner.nextLine();
            double pointsFromJury = Double.parseDouble(scanner.nextLine());

            countPoints = (academyPoints + (juryName.length() * pointsFromJury) / 2);
            academyPoints = +countPoints;

            if (academyPoints >= maxPoints) {
                break;
            }
        }

        if (countPoints < maxPoints) {
            double neededPoints = maxPoints - countPoints;
            System.out.printf("Sorry, %s you need %.1f more!", actorName, neededPoints);
        } else {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, countPoints);
        }
    }
}
