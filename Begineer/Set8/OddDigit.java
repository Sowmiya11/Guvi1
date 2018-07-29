import java.util.Scanner;

public class OddDigit 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		StringBuilder out=new StringBuilder();
		while(n>0)
		{
			int digit=n%10;
			if(digit%2!=0)
				out.append(digit+" ");
			n/=10;
		}
		System.out.println(out.reverse().substring(1,out.length()));
		s.close();
	}
}
