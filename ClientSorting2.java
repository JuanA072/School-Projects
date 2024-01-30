public class ClientSorting2 {
public static void printArray(int[] arr) {
for(int i=0; i<arr.length; i++)
System.out.print(arr[i] + ",");
System.out.println();
}
public static void selectionSort(int[] a) {
int i, j, maxIndex, temp;
for (i = 0; i < (a.length-1); i++) {
maxIndex = i;
for (j = i+1; j < a.length; j++) {
if (a[j] > a[maxIndex]) {
maxIndex = j;
}
}
temp = a[i];
a[i] = a[maxIndex];
a[maxIndex] = temp;
}
}
public static void bubbleSort(int[] a) {
int i, j, temp;
for(i=0;i<a.length;i++) {
for(j=0;j<a.length-i-1;j++) {
if(a[j] < a[j+1]) {
temp = a[j];
a[j] = a[j+1];
a[j+1] = temp;
}
}
}
}
public static void insertionSort(int[] a) {
for (int i = 1; i < a.length; i++) {
int j = i-1;
int k = a[i];
while (j >= 0 && k < a[j]) {
a[j+1] = a[j];
j = j-1;
}
a[j+1] = k;
}
}


public static void printStrArray(String[] arr) { 
for(int i=0; i<arr.length; i++)
System.out.print(arr[i] + ",");
System.out.println();
}

public static void SelectionSorter( String[] arr ){ 
for ( int j=0; j < arr.length-1; j++ )
{
int min = j;
for ( int k=j+1; k < arr.length; k++ )
if ( arr[k].compareTo( arr[min] ) < 0 ) min = k;
String temp = arr[j];
arr[j] = arr[min];
arr[min] = temp;
}
}
public static void InsertSorter(String arr[]){ 
String temp=""; 
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++){
if(arr[i].compareToIgnoreCase(arr[j])>0){
temp = arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
}

static void modified_selection_sort(int[] arr){ 
for (int i = 0, j = arr.length - 1; i < j; i++, j--)
{
int min = arr[i], max = arr[i];
int min_i = i, max_i = i;
for (int k = i; k <= j; k++)
{
if (arr[k] > max) 
{
max = arr[k];
max_i = k;
}
else if (arr[k] < min) 
{
min = arr[k];
min_i = k;
}
}
swap(arr, i, min_i);
if (arr[min_i] == max)
swap(arr, j, min_i);
else
swap(arr, j, max_i);
}
}
static int[] swap(int []arr, int i, int j){ 
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
return arr;
}


public static void main(String[] args) {

String as[] = {"a", "c", "b"}; 
System.out.println("Original Array : ");
printStrArray(as);
SelectionSorter(as);
System.out.println("After SelectionSorter : ");
printStrArray(as);

String asis[] = {"a", "d", "b","c"}; 
System.out.println("Original Array : ");
printStrArray(asis);
InsertSorter(asis);
System.out.println("After InsertSorter : ");
printStrArray(asis);

int amss[] = {5, 7, 3, 2, 20, 8}; 
System.out.println("Original Array : ");
printArray(amss);
modified_selection_sort(amss);
System.out.println("After modified selection sort : ");
printArray(amss);


int a[] = {5, 7, 3, 2, 20, 23, 12, 8};
System.out.println("Original Array : ");
printArray(a);
System.out.println("After Selection sort : ");
selectionSort(a);
printArray(a);
int a1[] = {5, 7, 3, 2, 20, 23, 12, 8};
System.out.println("Original Array : ");
printArray(a1);
System.out.println("After Bubble sort : ");
bubbleSort(a1);
printArray(a1);
int a2[] = {5, 7, 3, 2, 20, 23, 12, 8};
System.out.println("Original Array : ");
printArray(a2);
System.out.println("After Insertion sort : ");
insertionSort(a2);
printArray(a2);
}
}
