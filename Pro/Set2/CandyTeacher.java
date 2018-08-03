import java.util.Scanner;

public class CandyTeacher
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int rate=arr[0];
		for(int i=0;i<n-1;i++)
		{
			//System.out.println(arr[i]+" "+arr[i+1]);
			if(arr[i]<=arr[i+1])
			{
				rate+=arr[i+1];
				//System.out.println(rate);
			}
			
		}
		System.out.println(rate);
		s.close();
	}
}
