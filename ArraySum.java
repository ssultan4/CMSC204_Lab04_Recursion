/*
 * Class: CMSC 204 CRN 32235
 * Instructor: Gary Thai
 * Description: This program uses a recursion method to conduct the Fibonacci sequence.
 * Due: 02/21/2021
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: _Sereen Sultana_
*/

package Lab04_Recursion;

public class ArraySum {
	
	/**
	 * sumOfArray recursion sum of array
	 * @param a array of integers
	 * @param index of the last element to sum
	 * @return
	 */
	public static <T> int sumOfArray (Integer[] arr, int num) {
		if(num==0)
			return arr[num];
		return (sumOfArray(arr, num-1)+ arr[num]);
	}

	/*
	 * fib recursion method
	 * @param an array of integers
	 * @param an index of the array
	 * @return an int that is the fibonacci number at the given index
	 */
	public static int fib(int[] array, int n)
	{	
		if (array[n] != 0) //Checks that the index has any value other than the default 0
			return array[n];
		else if (n == 0) //first base case will stop the program from subtracting n-1, and n-2, crashing the program
			return 0;
		else if (n == 1) //second base case will stop the program from subtracting n-1 and n-2, crashing the program
			return 1;
		else { //perform recursive calculation
		array[n] = fib(array, n-1) + fib(array, n-2);
		return array[n];
		}
	}
	
}
