
public class hww {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		let nums = [4,2,9,1,8];
		divideArray(nums);

		//divideArray() function definition
		function divideArray(arr)
		{
		//declare two arrays
		let evenArray=[];
		let oddArray=[];
		//initialize evenIndex oddIndex with 0
		let evenIndex=0,oddIndex=0;
		for(i=0;i<arr.length;i++)
		{
		//if array element is even,store it into evenArr
		if(arr[i]%2==0)
		{

		evenArray[evenIndex]=arr[i];
		//increment evenIndex by 1
		evenIndex++;
		}
		//otherwise,store it into oddArr
		else
		{
		oddArray[oddIndex]=arr[i];
		//increment oddIndex by 1
		oddIndex++;
		}
		}
		//sorting array
		//outer for loop iterate size-1 times
		for(i=0;i<evenArray.length-1;i++)
		//for each i,inner loop iterate size-i-1 times
		for(j=0;j<evenArray.length-i-1;j++)
		{
		//if adjacent elements are not in ascending order,then swap the elements
		if(evenArray[j]>evenArray[j+1])
		{
		//swap the numbers using a temporary variable temp
		temp=evenArray[j];
		evenArray[j]=evenArray[j+1];
		evenArray[j+1]=temp;
		}
		}

		//sorting array
		//outer for loop iterate size-1 times
		for(i=0;i<oddArray.length-1;i++)
		//for each i,inner loop iterate size-i-1 times
		for(j=0;j<oddArray.length-i-1;j++)
		{
		//if adjacent elements are not in ascending order,then swap the elements
		if(oddArray[j]>oddArray[j+1])
		{
		//swap the numbers using a temporary variable temp
		temp=oddArray[j];
		oddArray[j]=oddArray[j+1];
		oddArray[j+1]=temp;
		}
		}
		console.log("Even numbers:")
		//if evenArray is empty,then print "None"
		if(evenArray.length<=0)
		console.log("None");
		//otherwise display array elements
		else
		{
		// for loop iterate through evenArray
		for(i=0;i<evenArray.length;i++)
		{
		//display array element
		console.log(evenArray[i]);
		}
		}

		console.log("Odd numbers:")
		//if oddArray is empty,then print "None"
		if(oddArray.length<=0)
		console.log("None");
		//otherwise display array elements
		{
		// for loop iterate through oddArray
		for(i=0;i<oddArray.length;i++)
		{
		//display array element
		console.log(oddArray[i]);
		}}}
		
