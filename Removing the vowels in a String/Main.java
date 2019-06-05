import java.util.Scanner;
class Main
{
  static String remVowel(String str) 
    { 
         return str.replaceAll("[aeiouAEIOU]", ""); 
    } 
  public static void main(String args[])
  {
    //type your code here
    Scanner st=new Scanner(System.in);
    String s=st.nextLine();
   StringBuilder sb= new StringBuilder(s);
    
    System.out.print( remVowel(s) );
             
              
              
    
  }
}