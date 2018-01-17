import java.util.*;
class LargeNum
{
  Scanner scan=new Scanner(System.in);
  int num1=scan.next();
  int num2=scan.next();
  int num3=scan.next();
  if(num1>num2 && num1>num3)
     System.out.println(num1+"is greater");
  else if(num2>num3)
     System.out.println(num1+"is greater");
  else
      System.out.println(num1+"is greater");
  scan.close();
}
  