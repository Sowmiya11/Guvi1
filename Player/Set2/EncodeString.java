package playerSet2;

import java.util.Scanner;

public class EncodeString 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String out="";
		for(int i=0;i<str.length();i++)
		{
			out+=(char)(str.charAt(i)+3);
		}
		System.out.println(out);
		s.close();
	}
}
