package playerSet1;
import java.util.Arrays;
import java.util.Scanner;

public class StringCom
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),min=0;
		String str[]=new String[n];
		int[] lenAr=new int[n];
		for (int i = 0; i<str.length; i++) 
		{
		 str[i]=s.next();
		 lenAr[i]=str[i].length();
		}
		Arrays.sort(lenAr);
		min=lenAr[0];
		int l=0;
		String out="";
		for(int i=0;i<str[0].length();i++)
		{
			char c=str[0].charAt(i);
			int f=0;
			for(int j=0;j<str.length;j++)
			{
				if(l<min&&str[j].charAt(l)==c)
				{
					f=0;
				}
				else
					f=1;
			}
			l++;
			if(f==1)
			{
				break;
			}
			else
				out+=c;
		}
		System.out.println(out);
		s.close();
	}
}
