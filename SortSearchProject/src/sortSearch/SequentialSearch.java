// This is a class for sequential search
package sortSearch;

//Java code for linearly searching x in arr[]. If x  
//is present then return its location, otherwise  
//return -1  

public class SequentialSearch  
{  
	int sequentialSearch(int arr[], int x) 
	{ 
		int n = arr.length; 
		for(int i = 0; i < n; i++) 
		{ 
			if(arr[i] == x) 
				return i; 
		} 
		return -1; 
	} 
}