import java.util.Scanner;

public class NnotK
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println((int)(Math.pow(n, k)));
		s.close();
	}
}
