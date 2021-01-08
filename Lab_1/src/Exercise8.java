import java.util.Scanner;

/**
 * @author Anjali
 *
 */
public class Exercise8 {

	public static void main(String[] args) {
		System.out.println("Enter a number to check power of two or not: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(checkNumber(num));

	}

	private static boolean checkNumber(int num) {
		if(num==0)
			return false;

		return (int)(Math.ceil((Math.log(num) / Math.log(2)))) == 
			(int)(Math.floor(((Math.log(num) / Math.log(2)))));

	}

}
