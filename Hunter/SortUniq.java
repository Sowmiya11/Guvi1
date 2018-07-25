import java.util.*;
public class SortUniq 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
			if(!al.contains(arr[i]))
			{
				al.add(arr[i]);
			}
			}
		}
		for(int i=0;i<al.size();i++)
			System.out.print(al.get(i)+" ");
		s.close();
	}
}
