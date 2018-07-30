import java.util.Scanner;

public class Cuboid
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int len=s.nextInt();
		int width=s.nextInt();
		int height=s.nextInt();
		int area=2*((len*width)+(len*height)+(width*height));
		int volume=len*width*height;
		System.out.println(area+" "+volume);
		s.close();
	}
}
