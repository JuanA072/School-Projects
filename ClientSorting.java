
import java.util.Scanner ;
public class ClientSorting {
   public static void SelectionSorter(int[] arr) {
       int n = arr.length;

       for (int i = 0; i < n - 1; i++) {

           int min_ind = i;
           for (int j = i + 1; j < n; j++)
               if (arr[j] < arr[min_ind])
                   min_ind = j;

           int temp = arr[min_ind];
           arr[min_ind] = arr[i];
           arr[i] = temp;
       }
   }

   public static void BubbleSorter(int[] arr) {
       int n = arr.length;
       int temp;
       for (int i = 0; i < n - 1; i++)
           for (int j = 0; j < n - i - 1; j++)
               if (arr[j] > arr[j + 1]) {
                   temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
               }
   }

   public static void InsertSorter(int[] arr) {
       int n = arr.length;
       for (int j = 1; j < n; j++) {
           int key = arr[j];
           int i = j - 1;
           while ((i > -1) && (arr[i] > key)) {
               arr[i + 1] = arr[i];
               i--;
           }
           arr[i + 1] = key;
       }
   }

   public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of the array : ");
       int n = sc.nextInt();
       int arr[] = new int[n];
       System.out.println("Enter the elements of the array : ");
       for(int i = 0 ; i < n; i++)
           arr[i] = sc.nextInt();
       System.out.print("Array before sorting : " );
       for(int val : arr)
           System.out.print(val + " ");
       System.out.println("");
       SelectionSorter(arr);
       System.out.print("Array after sorting : " );
       for(int val : arr)
           System.out.print(val + " ");
       System.out.println("");

   }

}