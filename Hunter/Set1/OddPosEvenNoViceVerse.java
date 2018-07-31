import java.util.Scanner;

public class OddPosEvenNoViceVerse
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()+1;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			if(i%2==0&&arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
			else if(i%2!=0&&arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		s.close();
	}
}
