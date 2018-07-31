import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EqualIndex
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			if(arr[i]==i)
			{
				al.add(arr[i]);
			}
		}
		Collections.sort(al);
		for(int i=0;i<al.size();i++)
			System.out.print(al.get(i)+" ");
		s.close();
	}
}
