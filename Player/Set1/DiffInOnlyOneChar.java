import java.util.Scanner;

public class DiffInOnlyOneChar 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		int c=0;
		if(str1.length()==str2.length())
			for(int i=0;i<str1.length();i++)
			{
				if(str1.charAt(i)!=str2.charAt(i))
				{
					c++;
				}
			}
			if(c==1)
			{
				System.out.println("yes");
			}
			else
				System.out.println("no");
		s.close();
	}
}
