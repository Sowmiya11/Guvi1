import java.util.Scanner;

public class BallBaloon
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		int c=0;
		int m=Math.max(str1.length(), str2.length());
		for(int i=0;i<m;i++)
		{
			if(str1.length()>i&&str2.length()>i)
			{
				if(str1.charAt(i)!=str2.charAt(i))
				{
					c++;
				}
			}
			else
			{
				c++;
			}
		}
		System.out.println(c);
		s.close();
	}
}
