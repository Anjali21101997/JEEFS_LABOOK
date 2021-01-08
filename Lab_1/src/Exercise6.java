import java.util.Scanner;

/**
 * @author Anjali
 *
 */
public class Exercise6 {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int result=calculateDifference(num);
		System.out.println(" "+result);

	}

	private static int calculateDifference(int num) {
		int sqrsum=0,sum=0;
		for(int i=1;i<=num;i++)
		{
			sqrsum=sqrsum+i*i;
			sum=sum+i;
			
		}
		int diff=sqrsum-sum*sum;
		return diff;
	}

}
