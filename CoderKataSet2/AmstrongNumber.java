public class AmstrongNumber 
{
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int no=s.nextInt();
		int d=0;
		int n=no;
		while(n>0)
		{
			d+=(n%10)*(n%10)*(n%10);
			n/=10;
		}
		if(d==no)
			System.out.println("yes");
		else
			System.out.println("No");
		s.close();
	}
}