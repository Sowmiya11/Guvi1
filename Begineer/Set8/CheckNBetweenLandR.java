import java.util.Scanner;

public class CheckNBetweenLandR 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int l=s.nextInt();
		int r=s.nextInt();
		if(l<n&&n<r)
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
		s.close();
	}
}
