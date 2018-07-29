import java.util.Scanner;

public class MultipleOf13
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%13==0)
			System.out.println("yes");
		else
			System.out.println("no");
		s.close();
		
	}
}
