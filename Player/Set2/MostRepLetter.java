import java.util.Scanner;

public class MostRepLetter
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		if(str.length()>=1&&str.length()<=100000)
		{
			int c=0,max=0;
			char ch[]=str.toCharArray(),cha='\u0000';
			for(int i=0;i<ch.length;i++)
			{
				c=1;
				for(int j=i;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						c++;
					}
				}
				if(c>max)
				{
					max=c;
					cha=ch[i];
				}
			}
			System.out.println(cha);
		}
		s.close();
	}
}
