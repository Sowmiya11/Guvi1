import java.util.Scanner;

public class Composite
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%2==0)
				c++;
		}
		if(c!=2&&n>1)
			System.out.println("yes");
		else
			System.out.println("no");
		s.close();
	}
}
