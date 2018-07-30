import java.util.Scanner;

public class GCD
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println(gcd(n1,n2));
		s.close();
	}
	public static int gcd(int a,int b)
	{
		if(a==0||b==0)
			return 0;
		if(a==b)
			return a;
		if(a>b)
			return gcd(a-b,b);
		return gcd(b,b-a);
	}
}
