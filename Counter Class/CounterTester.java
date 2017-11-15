/***********************************************************************
 * AUTHOR:	Nery Chapeton-Lamas
 * COURSE:	CS 111 (Intro to CS I: Java)
 * HW #:	7
 * PROJECT:	2
 * LASTMOD:	10/08/2015
 * *********************************************************************/

/***********************************************************************
 * TITLE: Counter Class Tester
 * *********************************************************************
 * PROGRAM DESCRIPTION: Test all methods and possibilities for Counter
 * *********************************************************************
 * OBJECTIVES:
 * - Test toString() right after instantiation + after changes
 *   - Shows default value at start, and value after many changes
 * - Test increment() several times and output toString()
 * - Test decrement() several times and output toString()
 *   - Also test past 0 to see if it becomes negative (shouldn't)
 *   	- Output current() as it decrements to see if it goes past 0
 * - Test reset() on object with non-zero value
 * *********************************************************************/

public class CounterTester
{
	public static void main(String[] args)
	{
		Counter count1, count2;

		count1 = new Counter();
		count2 = new Counter();

		System.out.println("START OF ALL OBJECTS, should all be 0's!!");
		System.out.println( "Count #1: " + count1 );//testing toString(), 
		System.out.println( "Count #2: " + count2 );//it's called automatically on objects in println()!

		for(int i = 0; i < 10; i++)
		{
			count1.increment();
		}

		for(int i = 0; i < 49; i++)
		{
			count2.increment();
		}

		System.out.println("\nCount 1 = 10, Count 2 = 49");
		System.out.println( "Count #1: " + count1.toString() );	//just to show explicit call works the same
		System.out.println( "Count #2: " + count2.toString() );
		System.out.println();

		count1.reset();	//testing reset
		
		for(int i = 0; i < 45; i++)
		{
			count2.decrement();
		}
		
		for(int i = 0; i < 5; i++)
		{
			count2.decrement();
			System.out.println("Count 2 after decrement = " + count2.current() );
		}

		System.out.println("\nCount 1 = 0, Count 2 = 0");
		System.out.println( "Count #1: " + count1 );
		System.out.println( "Count #2: " + count2 );
	}

}
