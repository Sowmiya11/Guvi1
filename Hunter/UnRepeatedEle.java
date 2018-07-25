import java.util.Scanner;

public class UnRepeatedEle 
{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//char ch[]=new char[n];
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int a=0;
		for(int i=0;i<n;i++)
		{
			a=0;
			for(int j=0;j<n;j++)
			{
				if(i!=j&&arr[i]==arr[j])
				{
					a=1;
				}
			}
			if(a==0)
			{
				System.out.println(arr[i]);
			}
		}
		s.close();
	}
}

