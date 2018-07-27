import java.util.Scanner;

public class CountDigit
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		String str=String.valueOf(n);
		System.out.println(str.length());
		s.close();
	}
}