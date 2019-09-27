import java.util.Scanner;

/**
 * StringInput
 */
public class StringInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        do {
            System.out.println("Enter a name, not admin please");
            name = scanner.nextLine();
        } while (name.equals("admin"));

        System.out.println("your name is: " + name);

        scanner.close();

    }
}