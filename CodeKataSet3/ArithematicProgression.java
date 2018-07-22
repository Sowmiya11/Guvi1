import java.util.*;
public class ArithematicProgression 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=s.nextInt();
		int b=s.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a;
			a+=b;
		}
		System.out.println(sum);
		s.close();
	}

}
