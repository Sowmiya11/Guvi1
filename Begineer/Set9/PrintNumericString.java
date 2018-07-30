import java.util.Scanner;

public class PrintNumericString 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String out="";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				out+=str.charAt(i);
			}
		}
		System.out.println(out);
		s.close();
	}
}
