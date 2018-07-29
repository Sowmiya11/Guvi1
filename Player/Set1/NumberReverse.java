import java.util.Scanner;

public class NumberReverse 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		StringBuilder sb=new StringBuilder(String.valueOf(n));
		System.out.println(sb.reverse().toString());
		s.close();
	}
}
