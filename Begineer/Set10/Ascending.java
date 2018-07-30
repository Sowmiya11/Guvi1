import java.util.Scanner;

public class Ascending 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int f=0,pos=0;
		for(int i=0;i<n;i++)
		{
			
			for(int j=i+1;j<n;j++)
			{
				if((arr[i]>arr[j]))
				{
					pos=i;
					f=1;
				}
			}
		}
		if(f==0)
			System.out.println(n/2);
		else
		{
			System.out.println(pos+1);
		}
		s.close();
	}
}
