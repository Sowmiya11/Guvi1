import java.util.Scanner;

public class VowelCheck
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String vowel="aeiou";
		int c=0;
		String str=s.nextLine();
		for(int i=0;i<str.length();i++)
		{
			String a=""+str.charAt(i);
			if(vowel.contains(a))
			{
				c++;
			}
		}
		if(c>0)
			System.out.println("yes");
		else
			System.out.println("no");
		s.close();
	}
}
