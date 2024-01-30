
public class lab6{

public static void main(String []args){

int arr[]={11,21,21,33,40,40,40,50}; //input array

System.out.println("Output by method 1 Merge");

deDuplication1(arr); //calling method 1

System.out.println("\nOutput by method 2 quick ");

deDuplication2(arr); //calling method 2

}

//method 1 with time complexity O(n) space complexity O(n)

static void deDuplication1(int []arr)

{

int n=1;

int num=arr[0];

//finding number og unique element in array

for(int i=1;i<arr.length;i++)

{

if(arr[i]!=num)

{

n++;

num=arr[i];

}

}

int []res=new int[n]; //declare new array of size number of unique element

int k=1,val=arr[0];

res[0]=arr[0];

//put all the unique element in new array

for(int i=1;i<arr.length;i++)

{

if(arr[i]!=val)

{

res[k]=arr[i];

k++;

val=arr[i];

}

}

//print final array

for(int i=0;i<res.length;i++)

{

System.out.print(res[i]+" ");

}

}

//method 2 with time complexity O(n) space complexity O(1)

static void deDuplication2(int []arr)

{

int temp=arr[0],k=1; //constant space complexity

// take O(n) time

for(int i=1;i<arr.length;i++)

{

//takes constant time

if(arr[i]!=temp)

{

arr[k++]=arr[i];

temp=arr[i];

}

}

//print final array

for(int i=0;i<k;i++)

{

System.out.print(arr[i]+" ");

}

}

}