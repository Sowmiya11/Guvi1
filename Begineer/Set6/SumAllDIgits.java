import java.util.Scanner;

public class SumAllDIgits 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int digit=0;
		while(n>0)
		{
			digit+=n%10;
			n/=10;
		}
		System.out.println(digit);
		s.close();
	}
}
