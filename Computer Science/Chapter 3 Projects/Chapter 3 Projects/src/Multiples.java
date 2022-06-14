//********************************************************************
//  Multiples.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a for loop.
//********************************************************************

import java.util.Scanner;

public class Multiples
{
   //-----------------------------------------------------------------
   //  Prints multiples of a user-specified number up to a user-
   //  specified limit.
   //-----------------------------------------------------------------
	 public static void main (String[] args)
	   {
	      final int MAX_ROWS = 10;

	      for (int row = 1; row <= MAX_ROWS; row++)
	      {
	         for (int star = 1; star <= row; Math.pow(star, 2))
	            System.out.print ("*");

	         System.out.println();
	      }
	   }

}
