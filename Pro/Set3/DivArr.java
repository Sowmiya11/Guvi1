import java.util.*;
public class DivArr
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[],b[],la,lb;
		if(n%2==0)
		{
			la=n/2;
			lb=n/2;
		}
		else
		{
			la=n/2+1;
			lb=n-(n/2)-1;
		}
		int avg1=0,avg2=0;
		 a=new int[la];
		 b=new int[lb];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			avg1+=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
			avg2+=b[i];
		}
		if(avg1/a.length==avg2/b.length)
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
		s.close();
	}
	
}
