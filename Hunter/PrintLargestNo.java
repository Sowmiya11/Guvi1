import java.util.*;
public class PrintLargestNo
{
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		Arrays.sort(arr);
		int num=0;
		for(int i=0;i<n;i++)
		{
			num=(num*10)+arr[i];
		}
		int nn=0;
		while(num>0)
		{
			nn=(nn*10)+num%10;
			num/=10;
		}
		System.out.println(nn+" ");
		s.close();
	}
}