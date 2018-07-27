import java.util.Scanner;

public class CountLines 
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	String str=s.next();
	String ss[]=str.split("\\.");
	System.out.println(ss.length);
	}
}
