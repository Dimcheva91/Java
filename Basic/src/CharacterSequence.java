import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (int index = 0; index < text.length(); index ++) {
            char letter = text.charAt(index);
            System.out.println(letter);
        }
    }
}
