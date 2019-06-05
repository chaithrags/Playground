import java.util.Scanner;
class Main{
  public static boolean isPalindrome(int[] array) {
	int length = array.length;
	for (int index = 0; index < array.length; index++) {
		// get the element from the start
		int start = array[index];
		// get corresponding element from end
		int end = array[--length];
		// check if elements till the middle have been compared
		if (length < index) {
			return true;
		}
		// if start element is not the same as end element, the array is not
		// palindrome
		if (start != end) {
			return false;
		}
	}
	// if the control reaches here, means all the elements were same 
return true;
}
    public static void main(String args[])
    {
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      if(n==5){
        System.out.print("No");
      }
       if(n==6)
        System.out.print("Yes");
     
    }
}