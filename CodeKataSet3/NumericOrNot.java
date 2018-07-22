import java.util.*;
public class NumericOrNot 
{
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		if(Character.isDigit(str.charAt(0)))
		{
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		s.close();
	}

	
}
