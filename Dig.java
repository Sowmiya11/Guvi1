import java.util.*;
class Dig
{
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter the number");
  int num=scan.next();
  while(num>0)
  {
  num=num/10;
  count++;
  }
  System.out.println(count);
  scan.close();
}