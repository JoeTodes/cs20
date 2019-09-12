import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int grade = 0;
        boolean isNumberEntered = false;

        do {
            try {
                System.out.println("Please enter your grade");
                grade = scanner.nextInt();
                isNumberEntered = true;
            } catch (Exception e) {
                System.out.println("improper input, try again");
                scanner.nextLine();
            }
        } while (!isNumberEntered);
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