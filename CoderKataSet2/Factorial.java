import java.util.*;
public class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int fact=1;
		for(int i=n;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		s.close();
	}
}
