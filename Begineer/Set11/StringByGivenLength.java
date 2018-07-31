import java.util.Scanner;

public class StringByGivenLength 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int n=s.nextInt();
		System.out.println(str.substring(str.length()-n));
		s.close();
	}
}
