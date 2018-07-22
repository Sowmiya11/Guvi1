import java.util.*;
public class FindMax 
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
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
		s.close();
	}
}
