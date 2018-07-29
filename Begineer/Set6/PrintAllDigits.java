
import java.util.Scanner;

public class PrintAllDigits 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str=String.valueOf(n);
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i)+" ");
		}
		s.close();
	}
}
