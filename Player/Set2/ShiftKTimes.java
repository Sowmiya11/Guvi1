package playerSet2;

import java.util.Scanner;

public class ShiftKTimes 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int k=s.nextInt();
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=s.nextInt();
		}
		for(int j=0;j<k;j++)
		{
		int t=arr[0];
		for(int i=1;i<n;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[n-1]=t;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		s.close();
	}
	
}
