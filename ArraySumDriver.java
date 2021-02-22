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

import java.util.Scanner;

public class ArraySumDriver {
	private final static int ARRAY_SIZE = 6;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int index = 0;

		Integer[] myArray = new Integer[ARRAY_SIZE];
		
		myArray[index++] = 13;
		myArray[index++] = 5;
		myArray[index++] = 12;
		myArray[index++] = 6;
		
		int sum = ArraySum.sumOfArray(myArray, 3);
		System.out.println(sum);
		
		myArray[index++] = 7;
		myArray[index++] = 1;
		
		sum = ArraySum.sumOfArray(myArray, 5);
		System.out.println(sum);
		
		//Trying the fib method
		
		System.out.println("Enter a positive integer: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		while (num <= 0) 
		{
			System.out.println("Please enter a POSITIVE integer: ");
			num = scanner.nextInt();
		}
		int size = num + 1;
		int array[] = new int[size];
		System.out.println(ArraySum.fib(array, num));
		
		
	}
	
	
	/**
	 * Recursive method for generating sum of values in array
	 * @param arr array of Integers
	 * @param num index of array to sum all previous index values (including num)
	 * @return sum of array values
	 
	public static int sumOfArray(Integer[] arr, int num) {
		
	}
	*/
	}
