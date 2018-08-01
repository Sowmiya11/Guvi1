import java.util.Scanner;

public class CountAnagrams 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
			str[i]=s.next();
		String os="kabali";
		int c=0;
		
		for(int i=0;i<str.length;i++)
		{
			int f=0;
			str[i]=str[i].toLowerCase();
			
			for(int k=0;k<str[i].length();k++)
			{
			 f=0;
			for(int j=0;j<os.length();j++)
			{
				if(str[i].charAt(k)==os.charAt(j))
				{
					f=1;
					break;
				}
			}
			if(f==0)
				break;
			}
			if(f!=0)
				c++;
				
		}
		System.out.println(c);
	}
}
