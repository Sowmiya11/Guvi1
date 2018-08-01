import java.util.Scanner;

public class SmallestCommonDivisor 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n=n2;
		int t=1;
		while(t==1)
		{
			if(n%n1==0&&n%n2==0)
			{
				System.out.println(n);
				t=0;
			}
			else
			{
				n++;
				t=1;
			}
		}
	}
}
