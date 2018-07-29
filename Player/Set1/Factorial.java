import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);	
		int n=s.nextInt(),fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=i*fact;
		}
		System.out.println(fact);
		s.close();
	}
}
