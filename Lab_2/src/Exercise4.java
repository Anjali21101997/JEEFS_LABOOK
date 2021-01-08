import java.util.Scanner;

/**
 * @author Anjali
 *
 */
public class Exercise4 {

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
		removeDuplicates(arr,n);
	}

	private static void removeDuplicates(int[] arr,int n) {
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
					
			}
		}
		int[] arr1=new int[n];
		int q=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr1[q++]=arr[i];
			}
		}
		arr1[q++]=arr[n-1];
	   for(int i=0;i<q;i++)
	   {
		   System.out.println(arr1[i]);
	   }
}

}
