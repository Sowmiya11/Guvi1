import java.util.Scanner;

public class PerfectSquareOrNot
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n2=s.nextInt();
		int product=n*n2;
		if(Math.sqrt(product)-Math.floor(Math.sqrt(product))==0)
			System.out.println("yes");
		else
			System.out.println("no");
		s.close();
	}
}
