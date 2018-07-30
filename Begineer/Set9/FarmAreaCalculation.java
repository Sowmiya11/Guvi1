import java.util.Scanner;

public class FarmAreaCalculation 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		float l=s.nextFloat();
		float b=s.nextFloat();
		System.out.printf("%.5f",(l*b));
		s.close();
	}
}
