import java.util.Scanner;

public class GradesMessage {
    public static void main(String[] args) {
        // Get user input
        System.out.println("please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();

        // print message based on name
        if (name.equals("George")) {
            System.out.println("a special message for George");
        } else if (name.equals("Fred")) {
            System.out.println("a different message for Fred");
        } else {
            System.out.println("you're not George, or Fred");
        }

        switch (name) {
        case "George":
            System.out.println("a special message for George");
            break;
        case "Fred":
            System.out.println("a different message for Fred");
            break;
        default:
            System.out.println("you're not George, or Fred");
            break;
        }

    }

}