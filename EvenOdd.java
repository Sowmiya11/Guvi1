import java.util.*;
class EvenOdd
{
  Scanner scan=new Scanner(System.in);
  int num=scan.nextInt();
  if(num%2==0)
  {
    System.out.println("Even");
   }
else
   System.out.println("Odd");
scan.close();
}