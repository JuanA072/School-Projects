
import java.util.*;
class Main
{
      void sort(int arr[])//selection sort function to sort array first
        {
   int n = arr.length;
          for (int i = 0; i < n-1; i++)
                {
                        
              int min_idx = i;
       for (int j = i+1; j < n; j++)
             if (arr[j] < arr[min_idx])
                                        min_idx = j;

                int temp = arr[min_idx];
                       arr[min_idx] = arr[i];
                 arr[i] = temp;
                }
        }
        void removeDups(int[] arr, int n)
    {
 
        // Hash map which will store the
        // elements which has appeared previously.
   HashMap<Integer,
                Boolean> mp = new HashMap<>();
 
 for (int i = 0; i < n; ++i)
        {
 
            // Print the element if it is not
            // there in the hash map
   if (mp.get(arr[i]) == null)
                System.out.print(arr[i] + " ");
 
            // Insert the element in the hash map
         mp.put(arr[i], true);
        }
    }
        //Driver code
        public static void main(String args[])
        {
    Main ob=new Main();
              Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
                int arr[]=new int[n];
  for(int i=0;i<n;i++)
             {
     arr[i]=sc.nextInt();
                }
                ob.sort(arr);
    ob.removeDups(arr,n);
        }
}


