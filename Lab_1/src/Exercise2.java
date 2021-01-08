import java.util.Scanner;

/**
 * @author Anjali
 *
 */
public class Exercise2 {

	public static void main(String[] args) {
		System.out.println("Welcome to Traffic lights MENU");
		System.out.println("Enter 1 for RED");
		System.out.println("Enter 2 for YELLOW");
		System.out.println("Enter 3 for GREEN");
		System.out.println("Enter your choice: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Ready");
			break;	
		case 3:
			System.out.println("Go");
			break;
		default:
			break;
		}
		

	}

}
