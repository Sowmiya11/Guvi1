import java.util.Scanner;
public class EvenNumBetweenTwoNum
{
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a+1;i<b;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
		}
		s.close();
	}
}