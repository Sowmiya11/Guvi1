import java.util.Scanner;

public class StringPlus2
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next(),out="";
		for(int i=0;i<str.length();i++)
		{
			int c=str.charAt(i);
			if(c>=65&&c<=90)
			{
				int ch=c+3;
				int n=0;
				while(ch>90)
				{
					n++;
					ch--;
				}
				if(n==0)
					out+=(char)(ch);
				else
					out+=(char)(64+n);
			}
			if(c>=97&&c<=122)
			{
				int ch=c+3;
				int n=0;
				while(ch>122)
				{
					n++;
					ch--;
				}
				if(n==0)
					out+=(char)(ch);
				else
					out+=(char)(96+n);
			}
		}
		System.out.println(out);
	}
}
