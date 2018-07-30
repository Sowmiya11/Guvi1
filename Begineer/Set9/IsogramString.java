import java.util.Scanner;

public class IsogramString 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int flag=0;
		for(int i=0;i<str.length();i++)
		{
			int c=0;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
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
		if(flag==1)
			System.out.println("No");
		else
			System.out.println("yes");
		s.close();
	}
}
