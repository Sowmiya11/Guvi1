public class CountSpace
{

    public static void main(String []args)

     {

        Scanner s=new Scanner(System.in);

        String str=s.nextLine();
    
    int count=0;
   
     for(int i=0;i<str.length();i++)
   
     {
     
       if(Character.isWhitespace(str.charAt(i)))
 
           {

                count++;
    
        }

        }
     
   System.out.println(count);
     
}

}