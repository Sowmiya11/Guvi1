import java.util.Scanner;

public class StringReverse 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(s.nextLine());
		sb.reverse();
		System.out.println(sb.toString());
		s.close();
	}
}
