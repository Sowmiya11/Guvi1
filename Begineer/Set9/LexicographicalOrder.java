import java.util.Arrays;
import java.util.Scanner;

public class LexicographicalOrder 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		String out="";
		for(int i=0;i<ch.length;i++)
		{
			out+=ch[i];
		}
		System.out.println(out);
		s.close();
	}
}
