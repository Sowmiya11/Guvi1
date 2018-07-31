import java.util.Scanner;

public class DivBy2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%2==0)
			System.out.println(n/2);
		else
			System.out.println(n);
		s.close();
	}
}
