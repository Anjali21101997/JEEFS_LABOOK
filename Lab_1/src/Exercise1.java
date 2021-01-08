import java.util.Scanner;

/**
 * @author Anjali
 *
 */
public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		findCube(n);
		}

	private static void findCube(int n) {
		int sum=0;
		if(n!=0)
		{
			while(n!=0)
			{
				int rem=n%10;
				sum=sum+rem*rem*rem;
				n=n/10;
				
			}
			System.out.println("Sum of the cubes of n digit number: "+sum);
		}
		else
		{
			System.out.println("Enter a number greater than 0");
		}
		
	}

}
