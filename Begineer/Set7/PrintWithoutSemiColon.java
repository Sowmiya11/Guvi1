import java.util.Scanner;

public class PrintWithoutSemiColon
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		if(System.out.printf(s.nextLine())==null)
		s.close();
	}
}
