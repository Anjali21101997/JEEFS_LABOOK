import java.util.Scanner;

/**
 * @author Anjali
 *
 */
public class Exercise5 {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=calculateSum(n);
		System.out.println("Sum: "+sum);
		}

	private static int calculateSum(int n) {
		int total=0;
		if(n<3)
		{
			System.out.println("NUMBER NOT DIVISIBLE BY 3 OR 5");
		}
		else
		{
			for(int i=3;i<=n;i++) {
				if(i%3==0||i%5==0)
				{
					total=total+i;
					
				}
			}
		}
		return total;
	}

}
