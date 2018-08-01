import java.util.Scanner;

public class EncodedString 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		String out="";
		if(str1.length()==str2.length())
		{
			for(int i=0;i<str1.length();i++)
			{
				int n=(str1.charAt(i)-96)+(str2.charAt(i)-96);
				if(n==0)
					n=1;
				if(n>26)
					n-=26;
				out+=(char)(n+96);
			}
		}
		System.out.println(out);
		s.close();
	}
}
