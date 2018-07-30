import java.util.Scanner;

public class Kabali_NinjaNumber
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int kabaliNinjaNo=s.nextInt();
		int opponentNinjaNo=s.nextInt();
		System.out.println(opponentNinjaNo-kabaliNinjaNo);
		s.close();
	}
}
