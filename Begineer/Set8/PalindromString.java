import java.util.Scanner;

public class PalindromString 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		if(sb.toString().equals(str))
			System.out.println("yes");
		else
			System.out.println("no");
		s.close();
	}
}
