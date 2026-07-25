/**
 * File: CS106A_Fibonacci.java
 * ----------------------------
 * This Java program calculates the specified (nth) number 
 * in the Fibonacci sequence; in which each new term is 
 * the sum of the preceding two.
 */

import acm.program.*;

public class CS106A_Fibonacci extends ConsoleProgram
{	
	public void run()
	{ 
		int userInt = readInt("Enter a number and I'll tell you what number in" +
				"the Fibonnacci sequence is at that location: ");
		println("The " + calculateFibonacci(userInt));
	}
	
	
	private int calculateFibonacci(int n)
	{
		int result = 0;
		for (int i = n; i >= n - 2; i--){
			
		}
		return ((n-1) + (n-2));
	}
}