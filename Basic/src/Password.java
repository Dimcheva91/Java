import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String pass = scanner.nextLine();

        String currentPass = scanner.nextLine();

        while (!pass.equals(currentPass)) {
            currentPass = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", name);
    }
}
