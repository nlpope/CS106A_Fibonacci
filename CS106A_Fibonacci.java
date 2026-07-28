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
		//calculateFibonacciUpToSlot();
		displayFibonacciSequence();
	}
	
	
	private void displayFibonacciSequence()
	{
		println("This program lists the Fibonacci sequence.");
		
		int fibResult = 0;
		int oneSlotAgo = 0;
		int twoSlotsAgo = 0;
		int i = 0;
		
		while(true){
			if (i == 0) { fibResult = i; twoSlotsAgo = i; println(fibResult); }
			else if (i == 1) { fibResult = i; oneSlotAgo = i; println(fibResult); }
			else { 
				fibResult = oneSlotAgo + twoSlotsAgo; 
				if (fibResult >= MAX_TERM_VALUE) break;
				twoSlotsAgo = oneSlotAgo;
				oneSlotAgo = fibResult;
				println(fibResult);
			}
			i++;
		}
	}
	
	
	private void calculateFibonacciUpToSlot()
	{
		int endSlot = readInt("Enter a number and I'll tell you what number in" +
		" the Fibonnacci sequence is at that location: ");
		
		if (endSlot == 0) { messagePlurality = ""; }
		else if (endSlot % 10 == 1) { messagePlurality = "st"; }
		else if (endSlot % 10 == 2) { messagePlurality = "nd"; }
		else if (endSlot % 10 == 3) { messagePlurality = "rd"; }
		else { messagePlurality = "th"; }
 
		if (endSlot <= 0) { 
			println("You must enter a non-negative, non-zero integer. Let's try again...");
			calculateFibonacciUpToSlot();
		}
		
		int fibResult = 0;
		int oneSlotAgo = 0;
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
		
		println("The " + endSlot + messagePlurality + " number in the Fibonacci sequence is " 
				+ fibResult);
	}
	
	String messagePlurality;
	private static final int MAX_TERM_VALUE = 10000;
}