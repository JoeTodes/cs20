import java.util.Scanner;

public class Methods {
    static String name;
    static int age = 25;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        printMessage();

    }

    public static void printMessage() {
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
    }

}