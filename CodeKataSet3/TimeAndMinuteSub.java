import java.util.Scanner;
public class TimeAndMinuteSub 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int hour1=s.nextInt();
		int min1=s.nextInt();
		int hour2=s.nextInt();
		int min2=s.nextInt();
		int finalHour=Math.abs(((hour1*60)+min1)-((hour2*60)+min2));
		System.out.println(finalHour/60+" "+(finalHour%60));
		s.close();
	}
}
