import java.util.*;
public class EqualIndexElem 
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
		for(int i=0;i<n;i++)
		{
			if(i==arr[i])
			{
				System.out.print(arr[i]+" ");
			}
		}
		s.close();
	}
}