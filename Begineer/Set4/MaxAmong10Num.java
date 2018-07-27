import java.util.Scanner;

public class MaxAmong10Num 
{
 public static void main(String[] args) 
 {
	 Scanner s=new Scanner(System.in);
	 int max=0;
	 for(int i=0;i<10;i++)
	 {
		 int n=s.nextInt();
		 if(n>max)
		 {
			 max=n;
		 }
	 }
	 System.out.println(max);
	 s.close();
}
}
