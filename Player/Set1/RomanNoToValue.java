import java.util.Scanner;

public class RomanNoToValue 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int romanValue=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			int val=roman(str.charAt(i));
			int j=i-1;
			if(j>=0)
			{
				int valj=roman(str.charAt(j));
			if(val>valj)
			{
				romanValue-=val;
			}
			else if(val<valj)
			{
				romanValue+=val;
			}
			else
			{
				romanValue+=val;
			}
			}
			else
				romanValue=Math.abs(romanValue+val);
			}
		System.out.println(romanValue);
		s.close();
		}
		
	public static int roman(char c)
	{
		if(c=='I')
			return 1;
		else
			if(c=='V')
				return 5;
			else if(c=='X')
				return 10;
			else if(c=='L')
				return 50;
			else if(c=='C')
				return 100;
			else if(c=='D')
				return 500;
			else if(c=='M')
				return 1000;
			else
				return -1;
	}
}
