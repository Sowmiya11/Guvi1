import java.util.Scanner;
public class LongestSubstring 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char ch[]=str.toCharArray();
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]='\u0000';
				}
			}
			if(ch[i]!='\u0000')
				c++;
		}
		System.out.println(c);
		s.close();
	}
}
