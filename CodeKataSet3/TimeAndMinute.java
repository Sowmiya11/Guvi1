import java.util.*;
public class TimeAndMinute 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int min=s.nextInt();
		int hour=min/60;
		int sec=min%60;
		System.out.println(hour+" "+sec);
		s.close();
	}
}