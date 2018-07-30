import java.util.Scanner;

public class ModAndDIv 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String sp[]=str.split(" ");
		int no1=Integer.parseInt(sp[0]);
		int no2=Integer.parseInt(sp[2]);
		if(sp[1].equals("%")||sp[1].equals("/"))
		{
		if(sp[1].equals("%"))
		{
			System.out.println(no1%no2);
		}
		else
			System.out.println(no1/no2);
		}
		else
			System.out.println("Invalid inputs");
		s.close();
	}
}
