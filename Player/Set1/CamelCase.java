import java.util.Scanner;

public class CamelCase 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String out="";
		String strArr[]=str.split(" ");
		for(int i=0;i<strArr.length;i++)
		{
			if(strArr[i].length()>=0)
			{
				if(Character.isUpperCase(strArr[i].charAt(0)))
				{
					out+=Character.toLowerCase(strArr[i].charAt(0))+""+strArr[i].substring(1)+" ";
				}
				else
					out+=Character.toUpperCase(strArr[i].charAt(0))+""+strArr[i].substring(1)+" ";
			}
		}
		System.out.println(out.substring(0,out.length()-1));
		s.close();
	}
}
