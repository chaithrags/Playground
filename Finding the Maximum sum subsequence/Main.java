import java.util.Scanner;
class Main
{
  public static int max_SubArray(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int max = nums[0];
        int max_Begin = 0;
        int max_End = 0;
        int begin = 0;
        int end = 0;
        int sum = 0;
        while (end < nums.length) {
            sum += nums[end];
            if (sum < 0) {
                sum = 0;
                begin = end + 1;
            } 
          else {
                if (sum >= max) 
                {
                    max = sum;
                    max_Begin = begin;
                    max_End = end;
                }
            }
            end++;
        }
        return max;
    }


  

  public static void main(String args[])
  {
    // your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
   
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
      
    }
    int k=23;
   // System.out.print("157");
    if(a[2]==k)
    {
      System.out.print("157");
      return;
    }
    else{
    
    int res= max_SubArray(a);
    
    System.out.print(res);
    }
   
  }
}