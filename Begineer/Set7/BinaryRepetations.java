import java.util.Scanner;

public class BinaryRepetations
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int t=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(!((ch=='1')||(ch=='0')))
			{
				t=1;
				break;
			}	
		}
		if(t==0)
			System.out.println("yes");
		else
			System.out.println("no");
		s.close();
	}
}
