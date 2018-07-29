import java.util.Scanner;

public class EvenOddPositionChangeString
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		if(ch.length==1)
			System.out.println(ch[0]);
		else if(ch.length==2)
			System.out.println(ch[1]+""+ch[0]);
		else if(ch.length>2)
		{
		for (int i = 2; i <=ch.length; i+=2)
		{
			ch[i-1]=str.charAt(i-2);
			ch[i-2]=str.charAt(i-1);	
		}
		System.out.println(ch);
		}
		else
			System.out.println();
		s.close();
	}
}
