import java.util.Scanner;

public class SumAP 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int d=s.nextInt();
		int n=s.nextInt();
		int sum=n*(2*a+(n-1)*d)/2;
		System.out.println(sum);
		s.close();
	}
}
