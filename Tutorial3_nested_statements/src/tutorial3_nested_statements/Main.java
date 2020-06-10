package tutorial3_nested_statements;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input your age:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int age = Integer.parseInt(s);
		
		if(age >= 18) {
			System.out.println("Enter your favorite food");
			String food = sc.nextLine();
			
			if(food.equals("pizza")) {
				System.out.println("Excellent mine too!");
			}
			else {
				System.out.println("Thats a boring meal");
			}
		}
		else if(age > 13) {
			System.out.println("You are a teen ===)");
		}
		else {
			System.out.println("You are a kid :)");
		}
		
	}

}
