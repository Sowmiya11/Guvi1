import java.util.Scanner;

public class V 
{
	public static void main(String[] args) 
	{
		int j,i=1,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of items:");
		j=s.nextInt();
		for(i=1;i<=j;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of "+j+" number is "+sum);
		s.close();
	}
}
