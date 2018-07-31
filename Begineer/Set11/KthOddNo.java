import java.util.Scanner;

public class KthOddNo
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int arr[]=new int[n];
		int ele=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			if(arr[i]%2!=0)
			{
				ele++;
				if((ele)==k)
					System.out.println(arr[i]);
			}
		}
		s.close();
	}
}
