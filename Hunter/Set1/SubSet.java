import java.util.Scanner;

public class SubSet 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int arrn[]=new int[n];
		int arrk[]=new int[k];
		for(int i=0;i<n;i++)
			arrn[i]=s.nextInt();
		for(int j=0;j<k;j++)
			arrk[j]=s.nextInt();
		int flag=0;
		for(int i=0;i<n;i++)
		{
			int c=0;
			if(i<k)
			{
			for(int j=0;j<k;j++)
			{
				if(arrn[i]==arrk[j])
				{
					c++;
				}
			}
			if(c!=0)
			{
				flag=1;
				break;
			}
			}
		}
		if(flag==1)
			System.out.println("yes");
		else
			System.out.println("no");
		s.close();
	}
}
