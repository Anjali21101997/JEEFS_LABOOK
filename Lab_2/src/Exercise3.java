import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements in an array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter th elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int[] result=getSorted(arr,n);
		System.out.println("Array is: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(result[i]);
		}
	}

	private static int[] getSorted(int[] arr, int n) {
		for(int i=0;i<n;i++)
		{
			int num=arr[i];
			int sum=0;
			while(num!=0)
			{
				int rem=num%10;
				sum=sum*10+rem;
				num=num/10;
			}
			arr[i]=sum;
		}
		Arrays.sort(arr);
		return arr;
	}

}
