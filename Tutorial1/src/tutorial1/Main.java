package tutorial1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double perro = Math.pow(2,2);
		System.out.println("Este es el ejemplo de un n�mero cualquiera "+perro);
		//String x = "jello";
		System.out.println("Por favor introduce tu nombre:");
		Scanner sc = new Scanner(System.in);
		String scanned = sc.next();
		//System.out.println(scanned);
		
		System.out.println("Por favor introduce tu n�mero favorito:");
		Scanner sc1 = new Scanner(System.in);
		int scanned1 = sc.nextInt();
		//System.out.println(scanned1);
		
		System.out.println(scanned+" eres la persona m�s n�mero "+scanned1+" que conozco :)");
		//
		System.out.println(scanned.equals("hello"));
	}

}
