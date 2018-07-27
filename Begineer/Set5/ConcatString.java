
import java.util.Scanner;

public class ConcatString
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String str1=s.next();
		System.out.println(str+str1);
		s.close();
	}
}
