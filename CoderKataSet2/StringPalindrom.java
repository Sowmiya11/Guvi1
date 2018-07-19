public class StringPalindrom 
{
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String string=String.valueOf(n);
		StringBuilder sb=new StringBuilder(string);
		sb.reverse();
		String rev=sb.toString();
		if(rev.equals(string))
			System.out.println("Yes");
		else
			System.out.println("No");
		s.close();
	}
}
