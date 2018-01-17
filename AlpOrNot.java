import java.util.*;
class AlpOrNot
{
  Scanner scan=new Scanner(System.in);
  char ch=scan.next();
  if(ch<='a' && ch>='z' || ch>='A' && ch<='Z')
  {
    System.out.println("Alphabet");
  }
  else 
   System.out.println("Not an Alphabet");
scan.close();
}