import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Please enter your grade");

        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();

        scanner.close();

        if (grade >= 90) {
            System.out.println("congrats on your great mark!");
        } else if (grade >= 80) {
            int distance = 90 - grade;

            System.out.format("Nice try, you were %d away from honor role", distance);
        } else {
            System.out.println("too bad so sad");
        }

    }
}