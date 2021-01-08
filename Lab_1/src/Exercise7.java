import java.util.Scanner;

/**
 * @author Anjali
 *
 */
public class Exercise7 {

	public static void main(String[] args) {
		System.out.println("Enter a number to check: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(checkNumber(num));

	}

	private static boolean checkNumber(int num) 
	{
		int current_digit=num%10;
		num=num/10;
		while(num>0)
		{
			if(current_digit<num%10)
			{
				return false;
				
			}
			current_digit=num%10;
			num=num/10;
		}
		return true;
	
	}

}
