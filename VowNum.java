import java.util.*;
class VowNum
{
  Scanner scan=new Scanner(System.in);
  char ch=scan.next();
  if(ch<='a' && ch>='z' || ch>='A' && ch<='Z')
  {
    System.out.println("character");
  }
  else 
   System.out.println("number");
  scan.close();
}
