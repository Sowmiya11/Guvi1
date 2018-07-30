import java.util.Scanner;

public class CelciusToKelvin 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int celcius=s.nextInt();
		int kelvin=(int)(celcius+273.15);
		System.out.println(kelvin);
		s.close();
	}
}
