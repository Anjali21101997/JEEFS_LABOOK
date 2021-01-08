/**
 * @author Anjali
 *
 */
import java.util.Scanner;
public class Exercise1 {

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
		int result=getSecondSmallest(arr);
		System.out.println("Second smallest number is: "+result);
		

	}

	private static int getSecondSmallest(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		return arr[1];
	}

}
