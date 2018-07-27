import java.util.*;

public class CountAlpha
{
	
    
 public static void main(String []args)
    
 {
        
	Scanner s=new Scanner(System.in);
      
	  String str=s.nextLine();
        
int count=0;
        
for(int i=0;i<str.length();i++)
      
  {
           

 if(Character.isAlphabetic(str.charAt(i)))
        
    {
               
 count++;
           
 }
        
}
       
 System.out.println(count);
     

}
}
