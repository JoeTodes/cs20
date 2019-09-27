import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {
        int HONOR_ROLL_CUTTOFF = 95;
        int NICE_TRY_CUTTOFF=80;

        System.out.println("Please enter your grade ");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        scanner.close();

        if (grade >= HONOR_ROLL_CUTTOFF) {
            System.out.println("congrats on your great mark!");
        } else if (grade >= NICE_TRY_CUTTOFF) {
            int distance = HONOR_ROLL_CUTTOFF - grade;

            System.out.format("Nice try, you were %d away from honor role", distance);
        } else {
            System.out.println("too bad so sad");
        }

    }
}