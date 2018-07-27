import java.util.Scanner;

public class FactorialOfNnum 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int f1=0,f2=1,f=0;
		for(int i=0;i<n;i++)
		{
			f=f1+f2;
			f2=f1;
			f1=f;
			System.out.print(f+" ");
		}
		s.close();
	}
}
