import java.util.Scanner;

public class Jin_Ex5 {// Example of putting entered data into a variable

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in); //Syntax for input

		System.out.print("Please enter your age.>");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // num = The age you entered

		System.out.println("your age is "+input);
		System.out.printf("num=%d%n", num); // There is your age in num.
	}

}
