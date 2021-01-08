import java.util.Scanner;

/**
 * @author Anjali
 *
 */
public class Exercise2 {

	public static void main(String[] args) {
		System.out.println("Enter the number of words: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] input=new String[n];
		for(int i=0;i<n;i++)
		{
			input[i]=sc.next();
		}
	    String[] result=sortStrings(input,n);
	    for(int i=0;i<result.length;i++)
	    {
	    	System.out.println(result[i]);
	    }
		}

	private static String[] sortStrings(String[] input, int n) {
		if(n%2==0)
		{
			for(int i=0;i<n/2;i++)
			{
				input[i]=input[i].toUpperCase();
			}
			for(int i=n/2;i<n;i++)
			{
				input[i]=input[i].toLowerCase();
			}
		}
		else
		{
			for(int i=0;i<=n/2;i++)
			{
				input[i]=input[i].toUpperCase();
			}
			for(int i=n/2+1;i<n;i++)
			{
				input[i]=input[i].toLowerCase();
			}
		}
		return input;

}
}
