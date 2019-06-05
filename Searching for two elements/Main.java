import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      int flag1=0,flag2=0;
      int pos1=0,pos2=0;
      for(int i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      int e1=s.nextInt();
      int e2=s.nextInt();
      for(int j=0;j<n;j++)
      {
        if(e1==a[j])
        {
          flag1=1;
          pos1=j;
          break;
        }
      }
      for(int k=0;k<n;k++)
      {
        if(e2==a[k])
        {
          flag2=1;
           pos2=k;
          break;
        }
      }
      if(flag1==1) 
      
        System.out.println(pos1);
       
      
      else
         System.out.println(-1);
      if(flag2==1)
         System.out.println(pos2);
      else
        System.out.println(-1);
     
      
    }
}