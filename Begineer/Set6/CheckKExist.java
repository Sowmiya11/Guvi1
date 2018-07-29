import java.util.Scanner;

public class CheckKExist 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt();
		int[] arr=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			if(arr[i]==k)
				count++;
		}
		if(count>0)
			System.out.println("yes");
		else
			System.out.println("no");
		s.close();
	}
}
