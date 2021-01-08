import java.util.Scanner;

/**
 * @author Anjali
 *
 */
public class Exercise4 {

	public static void main(String[] args) {
		System.out.println("Enter an Integer: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printPrime(n);

	}

	private static void printPrime(int n) {
		for(int i=2;i<=n;i++)
		{
			if(primeNum(i))
			{
				System.out.println(i+ " ");
			}
		}
	}

	private static boolean primeNum(int n) {
		        int m=n/2;
				for(int i=2;i<=m;i++)
				{
					if(n%i==0)
					{
						return false;
						
					}
				}
				return true;
			}

}
