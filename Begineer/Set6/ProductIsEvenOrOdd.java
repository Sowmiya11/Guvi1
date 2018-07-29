
import java.util.Scanner;

public class ProductIsEvenOrOdd
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		if((n1*n2)%2!=0)
		{
			System.out.println("odd");
		}
		else
			System.out.println("even");
		s.close();
	}
}
