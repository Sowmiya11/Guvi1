import java.util.*;
class Year
{
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter the year");
  int year=scan.next();
  if(year%4==0)
    System.out.println("Leap Year");
  else
    System.out.println("Not leap year");
  scan.close();
}