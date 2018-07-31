import java.util.Scanner;

public class SumClosestToZero
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int ele1=0,ele2=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			int t=arr[i]+arr[j];
			if(t==0)
			{
				ele1=arr[i];
				ele2=arr[j];
			}
			}
		}
		System.out.println(ele1+" "+ele2);
		s.close();
	}
}
