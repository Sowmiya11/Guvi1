import java.util.Scanner;

public class PrintKthElement
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int pos=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
	
		System.out.println(arr[pos-1]);
		s.close();
	}
}
