import java.util.Scanner;

public class AmstrongNumberBetweenTwoNum
{
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int no=s.nextInt();
		int no1=s.nextInt();
		int d=0;
		for(int i=no+1;i<no1;i++)
		{
			d=0;
			int t=i;
		while(t>0)
		{
			d+=(t%10)*(t%10)*(t%10);
			t/=10;
		}
		if(d==i)
			System.out.println(d);
		
		}
		
		s.close();
	}
}
