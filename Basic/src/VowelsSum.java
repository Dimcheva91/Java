import java.util.Scanner;

public class VowelsSum {
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        String text= scanner.nextLine();
        int a = 1;
        int e = 2;
        int i = 3;
        int o = 4;
        int u = 5;

        int count = 0;

         for (int index = 0; index < text.length(); index ++) {

             switch (text.charAt(index)) {
                 case 'a':
                     count += a;
                     break;
                 case 'e':
                     count += e;
                     break;
                 case 'i':
                     count += i;
                     break;
                 case 'o':
                     count += o;
                     break;
                 case 'u':
                     count += u;
                     break;
             }
         }
         System.out.println(count);
     }
}
