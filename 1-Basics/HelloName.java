import java.util.Scanner;

public class HelloName{

	public static void main(String[] args){
		System.out.println("Hi, what is your name?");

		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		scanner.close();
		
		System.out.print("Hello ");
		System.out.println(name);

	}

}


/*
1. ask for the user's name
2. accept user input from keyboard
3. store the name in a variable
4. print a message back using the name
*/