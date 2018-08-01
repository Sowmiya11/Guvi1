
import java.util.Scanner;

public class ReverseVowel 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		StringBuilder sb=new StringBuilder();
		char c[]=str.toCharArray();
		char ch[]= {'a','e','i','o','u'};
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(c[i]==ch[j])
				{
					c[i]='\u0000';
					break;
				}
			}
			if(c[i]!='\u0000')
				sb.append(c[i]);
		}
		System.out.println(sb.reverse());
		s.close();
	}
}
