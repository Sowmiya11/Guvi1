import java.util.Scanner;

public class CharacterAsciiValue 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		System.out.println((int)(ch));
		s.close();
	}
	
}
