import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
   
    int l=str.length(); 
      char t[]=new char[l];
    int k=l/2;
    int j=0;
 for(int i=k;i<l;i++)
 {
   char c=str.charAt(i);
   t[j]=c;
   //System.out.print(t[j]);
   j++;
 }
    for(int i=0;i<k;i++)
    {
      char c=str.charAt(i);
      t[j]=c;
      // System.out.print(t[j]);
      j++;
    }
    //--j;
   // t[j]='\0';
    for(int i=1;i<=l;i++)
    {
      for(int n=l-i;n>0;n--)
      {
        System.out.print(" ");
      }
      int m=0;
      for(int p=1;p<=i;p++)
      {
        System.out.print(t[m]);
        m++;
      }
      System.out.println();
    }
    
  
    
  }
}