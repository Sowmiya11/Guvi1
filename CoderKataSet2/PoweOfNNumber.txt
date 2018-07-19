import java.util.*;
public class Pow_Of_N_Num 
{
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int pow=(int)Math.pow(a,b);
		System.out.println(pow);
		s.close();	
	}
}