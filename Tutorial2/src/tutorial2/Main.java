package tutorial2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if(s.equals("tim")) {
			System.out.println("You typed tim");
		}
		else if(s.equals("tom")) {
			System.out.println("You typed tom");
		}
		else {
			System.out.println("You didnt typed tim or tom");
		}

		
	}

}
