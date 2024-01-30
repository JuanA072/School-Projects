
	import java.util.*;
class MeanMedian2
{
   public static void main(String[] args)
   {
      // int[] nums;
	   Scanner nums = new Scanner(System.in);
      int num = 0;
      String entry;
      String list = "You entered: ";
      int a, b;
      int temp;
      double median;
      int total = 0;
      double mean = 0;
      final int QUIT = 9999;
      int size = 0;
      Object nums;
	for(a = 0; num != QUIT && a < nums.length; ++a)
      {
         // your code here
      }
     System.out.println("size is " + a);
      if(num != QUIT)
         size = nums.length;
      else
         size = a - 1;
      System.out.println("size is " + size);
      System.out.println(list);
      int comparisonsToMake = size - 1;
      for(a = 0; a < size - 1; ++a)
      {
         for(b = 0; b < comparisonsToMake; ++b)
         {
            if(nums[b] > nums[b + 1])
            {
               temp = nums[b];
               nums[b] = nums[b + 1];
               nums[b + 1] = temp;
            }
         }
         --comparisonsToMake;
      }
      
        // your code here

      System.out.println("The mean is " + mean +
         " and the median is " + median);

   }
}
   
