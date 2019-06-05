import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     String text = in.nextLine();
     StringBuilder str = new StringBuilder(text); 
     int key = in.nextInt();
    
     int str_len = str.length();
     for(int index = 0; index <= str_len - 1; index++)
     {
       char ch = str.charAt(index);
       if(ch >= 'A' && ch <= 'Z')
       {
           ch =( char)(((int)ch) - key);
         if(ch<'A'){
          
           ch =(char) ((int)ch+(int)'Z'-(int)'A'+1);
         }
       }
       else if(ch >= 'a' && ch <= 'z')
       {
            ch =( char)(((int)ch) - key);
         if(ch<'a'){
          
           ch =(char) ((int)ch+(int)'z'-(int)'a'+1);
         }
         
       }
       str.setCharAt(index,ch);
     }
     System.out.print(str);
   }
}