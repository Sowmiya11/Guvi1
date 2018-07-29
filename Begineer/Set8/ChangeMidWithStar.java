import java.util.Scanner;

public class ChangeMidWithStar 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int mid=str.length()/2;
		if(str.length()%2!=0)
		{
			System.out.println(str.substring(0, mid)+"*"+str.substring(mid+1));
		}
		else
		{
			System.out.println(str.substring(0,mid-1)+"**"+str.substring(mid+1));
		}
		s.close();
	}
}
