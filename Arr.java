import java.util.*;
class Arr
{
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter the number");
  int n=scan.next();
  int k=scan.next();
  int arr[]=new int[n];
  int i;
  for(i=0;i<n;i++)
     arr[i]=scan.next();
  for(int i=0;i<k;i++)
   sum=sum+arr[i];
  System.out.println(sum);
  scan.close();
}