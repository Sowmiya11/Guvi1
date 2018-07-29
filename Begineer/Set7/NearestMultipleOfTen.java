import java.util.Scanner;

public class NearestMultipleOfTen 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int ten=10,t=0;
		while(t==0)
		{
			if(n<ten)
			{
				t=1;
			}
			else
			{
				ten+=10;
			}
		}
		System.out.println(ten);
		s.close();
	}
}
