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
		userInt = readInt("Enter a number and I'll tell you what number in" +
				"the Fibonnacci sequence is at that location: ");
		if (userInt == 0) { messagePlurality = ""; }
		else if (userInt % 10 == 1) { messagePlurality = "st"; }
		else if (userInt % 10 == 2) { messagePlurality = "nd"; }
		else if (userInt % 10 == 3) { messagePlurality = "rd"; }
		else { messagePlurality = "th"; }
		 
		println("The " + userInt + messagePlurality + " number in the Fibonacci sequence is " 
				+ calculateFibonacciUpToSlot(userInt));
	}
	
	
	private int calculateFibonacciUpToSlot(int endSlot)
	{
		if (endSlot <= 0) { 
			println("You must enter a non-negative, non-zero integer. Let's try again...");
			run();
		}
		
		int fibResult = 0;
		int oneSlotAgo = 1;
		int twoSlotsAgo = 0;
		for (int i = 0; i < endSlot; i++){
			//fib = 0,1,(1+0)=1, (1+1)=2, (2+1)=3,...
			if (i == 0) { fibResult = i; twoSlotsAgo = i;}
			else if (i == 1) { fibResult = i; oneSlotAgo = i; }
			else { 
				fibResult = oneSlotAgo + twoSlotsAgo; 
				twoSlotsAgo = oneSlotAgo;
				oneSlotAgo = fibResult;
			}
		}
		return fibResult;
	}
	
	int userInt;
	String messagePlurality;
}