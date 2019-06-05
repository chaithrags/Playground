import java.util.Scanner;
class Main{
   
    public static void main(String args[]){
      // Type your code here
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      int l=str.length();
    int[] freq = new int[26]; 
      for(int i=0;i<26;i++)
      {
        freq[i]=0;
      }
      for (int i = 0; i <l; i++) 
      {
       if(str.charAt(i)>='a' && str.charAt(i)<='z')
            freq[str.charAt(i) - 'a']++; 
        else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
          freq[str.charAt(i) - 'A']++; 
    }
      for(int j=0;j<26;j++)
      {
        if(freq[j]==0)
        {
          int o=(j)+97;
          char ch=(char)(o);
          
          System.out.print(ch+" ");
        }
      }
    }
}