import java.util.Scanner;

public class TrekkingMania {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groupCount = Integer.parseInt(scanner.nextLine());

        double totalGrups = 0;
        int musala = 0;
        int montblanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int index = 1; index <= groupCount; index++) {

            int currentGroup = Integer.parseInt(scanner.nextLine());
            totalGrups += currentGroup;

            if (currentGroup <= 5) {
                musala += currentGroup;
            } else if (currentGroup >= 6 && currentGroup <= 12) {
                montblanc += currentGroup;
            } else if (currentGroup >= 13 && currentGroup <= 25) {
                kilimanjaro += currentGroup;
            } else if (currentGroup >= 26 && currentGroup <= 40) {
                k2 += currentGroup;
            } else {
                everest += currentGroup;
            }
        }
        System.out.printf("%.2f%%%n", musala * 100 / totalGrups);
        System.out.printf("%.2f%%%n", montblanc * 100 / totalGrups);
        System.out.printf("%.2f%%%n", kilimanjaro * 100 / totalGrups);
        System.out.printf("%.2f%%%n", k2 * 100 / totalGrups);
        System.out.printf("%.2f%%%n", everest * 100 / totalGrups);

    }
}
