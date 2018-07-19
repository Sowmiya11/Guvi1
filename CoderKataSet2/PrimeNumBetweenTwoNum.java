import java.util.Scanner;

public class PrimeNumBetweenTwoNum 
{
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int count=0;
		for(int i=a+1;i<b;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
			if(i%j==0)
				count++;
			}
			if(count==2)
				System.out.print(i+" ");
		}
		s.close();
	}
}
