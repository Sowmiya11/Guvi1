import java.util.Scanner;

public class UniqueEle
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()+1;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		int minPos=0;
		for(int i=0;i<n;i++)
		{
			int c=0,pos=0;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					c++;
					pos=j;
				}
			}
			if(c!=0&&minPos>pos)
			{
				minPos=pos;
			}
			else if(minPos==0&&pos!=0)
			{
				minPos=pos;
			}
				
			
		}
		System.out.println(arr[minPos]);
		s.close();
	}
}
