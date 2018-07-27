import java.util.Scanner;

public class StringCompare 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		if(str1.length()>str2.length())
		{
			System.out.println(str1);
		}
		else
		{
			System.out.println(str2);
		}
		s.close();
	}
}
