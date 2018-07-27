import java.util.Scanner;

public class SumOf2Num
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<2;i++)
		{
			sum+=s.nextInt();
		}
		System.out.println(sum);
		s.close();
	}
}
