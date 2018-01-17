import java.util.*;
class Hello
{
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter the number");
  int num=scan.next();
  for(int i=1;i<=num;i++)
    System.out.println("Hello");
  scan.close();
}