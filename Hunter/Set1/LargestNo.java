import java.util.Arrays;
import java.util.Scanner;

public class LargestNo 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		Arrays.sort(arr);
		int largeEle=0;
		for(int i=n-1;i>=0;i--)
		{
			largeEle=arr[i]+(largeEle*10);
		}
		System.out.println(largeEle);
		s.close();
	}
}
