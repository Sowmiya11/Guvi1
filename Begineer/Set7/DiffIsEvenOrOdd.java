import java.util.Scanner;

public class DiffIsEvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		if(Math.abs(n1-n2)%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		s.close();
	}
}
