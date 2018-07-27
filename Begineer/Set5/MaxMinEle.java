import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxMinEle 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			al.add(s.nextInt());
		}
		System.out.println(Collections.min(al)+" "+Collections.max(al));
		s.close();
	}
}
