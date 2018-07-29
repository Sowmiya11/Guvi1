
import java.util.Scanner;

public class PrintNumToWords1To10 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
		if(n>=1&&n<=10)
			System.out.println(str[n]);
		else
			System.out.println("Incorrect input");
		s.close();
	}
}
