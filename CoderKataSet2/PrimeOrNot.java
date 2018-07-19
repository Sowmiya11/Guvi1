import java.util.*;
public class PrimeOrNot
{
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
			System.out.println("Yes");
		else
			System.out.println("No");
		s.close();
	}
}
