import java.util.Scanner;

public class PrimeFactor 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for (int i = 1; i <n; i++) 
		{
			if(n%i==0)
			{
				int c=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
						c++;
				}
				if(c==2)
					System.out.print(i+" ");
			}
		}
		s.close();
	}
}
