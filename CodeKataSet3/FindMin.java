import java.util.Scanner;

public class FindMin
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
		int min=arr[0];
		for(int i=0;i<n;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(min);
		s.close();
	}
}
