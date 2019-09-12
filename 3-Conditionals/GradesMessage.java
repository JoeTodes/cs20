import java.util.Scanner;

public class GradesMessage {
    public static void main(String[] args) {
        System.out.println("please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (name.equals("George")) {
            System.out.println("Congrats!");
        }
    }

}