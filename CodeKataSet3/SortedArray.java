import java.util.Arrays;
import java.util.Scanner;

public class SortedArray
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		//Arrays.sort(arr); with using sorting
//Without using inbuild sorting functions
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			if(arr[i]>arr[j])
			{
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
			}
		}
		for(int i=0;i<n;i++)
		{
		System.out.println(arr[i]);
		}
		s.close();
	}
}
