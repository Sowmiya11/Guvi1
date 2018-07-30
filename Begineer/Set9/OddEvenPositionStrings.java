import java.util.Scanner;

public class OddEvenPositionStrings 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String oddOut="";
		String evenOut="";
		for(int i=0;i<str.length();i++)
		{
			if((i+1)%2!=0)
			{
				oddOut+=str.charAt(i);
			}
			else
				evenOut+=str.charAt(i);
		}
		System.out.println(oddOut+" "+evenOut);
		s.close();
	}
}
