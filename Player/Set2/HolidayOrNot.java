package playerSet2;

import java.util.ArrayList;
import java.util.Scanner;

public class HolidayOrNot
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		ArrayList<String> al=new ArrayList<String>();
		al.add("monday");
		al.add("tuesday");
		al.add("wednesday");
		al.add("thursday");
		al.add("friday");
		if(str.equalsIgnoreCase("sunday")||str.equalsIgnoreCase("satursday")) 
		{
			System.out.println("yes");
		}
		else if(al.contains(str.toLowerCase()))
		{
			System.out.println("no");
		}
		else
			System.out.println("invalid input");
		s.close();
	}
}
