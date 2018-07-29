import java.util.Scanner;

public class CheckAlphAndNumber 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int alphaCOunt=0,numCount=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
			{
				numCount++;
			}
			if(Character.isAlphabetic(ch))
			{
				alphaCOunt++;
			}
		}
		if(numCount>0&&alphaCOunt>0)
			System.out.println("yes");
		else
			System.out.println("no");
		s.close();
	}
}
