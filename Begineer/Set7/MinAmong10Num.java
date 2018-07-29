import java.util.Arrays;
import java.util.Scanner;

public class MinAmong10Num 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[0]);
		s.close();
	}
}
