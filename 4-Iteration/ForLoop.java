import java.util.Scanner;

/**
 * ForLoop
 */
public class ForLoop {

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        int len = name.length();

        for (int i = 0; i <= len; i++) {
            System.out.println(name.charAt(i));
        }

    }
}