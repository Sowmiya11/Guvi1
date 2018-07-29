import java.util.Scanner;

public class PrintFirstKLetters 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int n=s.nextInt();
		if(str.length()>n)
		{
			System.out.println(str.substring(0, n));
		}
		else
			System.out.println("Invalid inputs");
		s.close();
	}
}
