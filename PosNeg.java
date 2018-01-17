import java.util.*;
class PosNeg
{
  Scanner scan=new Scanner(System.in);
  int num=scan.nextInt();
  if(num>0)
   System.out.println("Positive");
  else if(num<0)
    System.out.println("Negative");
  else if(num==0)
    System.out.println("Zero");
else
    System.out.println("Invalid");
scan.close();
}