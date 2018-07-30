import java.util.Scanner;

public class LCM 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n=(n1>n2)?n1:n2;
		while(true)
		{
			if(n%n1==0&&n%n2==0)
				break;
			++n;
		}
		System.out.println(n);
		s.close();
	}
}
