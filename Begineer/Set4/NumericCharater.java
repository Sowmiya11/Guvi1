import java.util.Scanner;

public class NumericCharater 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int count=0;
		for (int i = 0; i < str.length(); i++) 
		{
			if(Character.isDigit(str.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(count);
		s.close();
	}
}
