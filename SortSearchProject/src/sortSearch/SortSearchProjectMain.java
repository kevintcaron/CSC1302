/*
 *This application creates an array containing 100,000 random integers.
 *It uses 4 different methods to sort the array and reports the time each method takes.
 *It uses 2 different methods to search the array and reports the time each method takes.
 *@author Kevin Caron & Rudolph Hamelburg
 *@version 11/18/2019
 */

package sortSearch;
import java.util.Random;

public class SortSearchProjectMain 
{

	public static void main(String[] args) 
	{
        //CREATE ARRAY - creates an array with 100,000 integers between 1 and 1,000,000
	    Random r = new Random();
	    int size = 100000;
        int x = 1+ r.nextInt(1000000); 
	    System.out.println("This application evaluates methods for sorting an array"); 
	    System.out.println("of " + size + " numbers and searching for the number " + x);     
	    int[] a = new int[size];
	    for (int i = 0; i < size; i++) {
	        a[i] = 1 + r.nextInt(1000000);   
		}
	    
	    //CLONE ARRAY - makes copies of the array so that the same unsorted array can be passed to other sort classes
        int[] b = a.clone();
        int[] c = a.clone();
        int[] d = a.clone();
        int[] e = a.clone();
        int[] f = a.clone();
        int[] g = a.clone();
        
        //PRINT TABLE 1 - creates headers for sort table
        System.out.println();
        System.out.println("Sort Method:        Time (ms):");
        
        //BUBBLE SORT - executes bubble sort and calculates the time it takes to complete and prints results
        BubbleSort bs = new BubbleSort(); 
    	long startTimeA = System.currentTimeMillis();
        bs.bubbleSort(a); 
        long endTimeA = System.currentTimeMillis();
        System.out.println("Bubble              "+(endTimeA - startTimeA));
                
        //SELECTION SORT - executes selection sort and calculates the time it takes to complete and prints results
        SelectionSort ss = new SelectionSort(); 
    	long startTimeB = System.currentTimeMillis();
        ss.selectionSort(b); 
        long endTimeB = System.currentTimeMillis();
        System.out.println("Selection           "+(endTimeB - startTimeB));
        
        //INSERTION SORT - executes insertion sort and calculates the time it takes to complete and prints results
        InsertionSort is = new InsertionSort(); 
    	long startTimeC = System.currentTimeMillis();
        is.insertionSort(c); 
        long endTimeC = System.currentTimeMillis();
        System.out.println("Insertion           "+(endTimeC - startTimeC));

        //MERGE SORT - executes merge sort and calculates the time it takes to complete and prints results
        MergeSort ms = new MergeSort(); 
    	long startTimeD = System.currentTimeMillis();
        ms.sort(d, 0, d.length-1); 
        long endTimeD = System.currentTimeMillis();
        System.out.println("Merge               "+(endTimeD - startTimeD));
        
        //QUICK SORT - executes quick sort and calculates the time it takes to complete and prints results
        QuickSort qs = new QuickSort(); 
    	long startTimeH = System.currentTimeMillis();
		qs.quickSort(e, 0, e.length-1); 
        long endTimeH = System.currentTimeMillis();
        System.out.println("Quick               "+(endTimeH - startTimeH));
        
        //HEAP SORT - executes heap sort and calculates the time it takes to complete and prints results
        HeapSort hs = new HeapSort(); 
    	long startTimeI = System.currentTimeMillis();
        hs.sortHeap(f); 
        long endTimeI = System.currentTimeMillis();
        System.out.println("Heap                "+(endTimeI - startTimeI));
        
        //Radix SORT - executes heap sort and calculates the time it takes to complete and prints results
        RadixSort rs = new RadixSort(); 
    	long startTimeJ = System.currentTimeMillis();
        rs.sortRadix(g, size); 
        long endTimeJ = System.currentTimeMillis();
        System.out.println("Radix               "+(endTimeJ - startTimeJ));
 
        System.out.println();
        System.out.println("The best sort method is Quick Sort.");
        
        //PRINT TABLE 2  - creates headers for sort table
        System.out.println();
        System.out.println("Search Method:      Time (ns):");

        //ITERATIVE BINARY SEARCH - executes an iterative binary search and calculates the time it takes to complete and prints results
        BinarySearch sb = new BinarySearch(); 
    	long startTimeE = System.nanoTime();
    	sb.binarySearch(a, x); 
        long endTimeE = System.nanoTime();
        System.out.println("Iterative Binary    "+(endTimeE - startTimeE));

        //RECURSIVE BINARY SEARCH - executes a recursive binary search and calculates the time it takes to complete and prints results
        RecursiveBinarySearch rbs = new RecursiveBinarySearch();
        long startTimeF = System.nanoTime();
        rbs.recursiveBinarySearch(a, 0, size, x);
        long endTimeF = System.nanoTime();
        System.out.println("Recursive Binary    "+(endTimeF - startTimeF));
        
        //SEQUENTIAL SEARCH - executes a sequential search and calculates the time it takes to complete and prints results
        SequentialSearch ls = new SequentialSearch(); 
    	long startTimeG = System.nanoTime();
    	ls.sequentialSearch(a, x); 
        long endTimeG = System.nanoTime();
        System.out.println("Sequential          "+(endTimeG - startTimeG));
        System.out.println();
        System.out.println("The best search method is Iterative Binary Search.");
            } 
}
