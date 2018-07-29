import java.util.Scanner;

public class PrimeInRange 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int count=0;
		for(int i=n1;i<=n2;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
				count++;
		}
		System.out.println(count);
		s.close();
	}
}
