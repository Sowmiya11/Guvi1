import java.util.Arrays;
import java.util.Scanner;

public class MedinEle 
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
		Arrays.sort(arr);
		System.out.println(arr[arr.length/2]);
		s.close();
	}
}
