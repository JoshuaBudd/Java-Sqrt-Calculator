//Joshua Budd
//April 16, 2017
//Lab11 Recursion

//import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class SquareRootCalculator {

	public static void main(String[] args) {
		
		int[] myArray = {9, 17, 25, 37, 49, 55, 999};
		
		System.out.println("++++++++++++++++++++++++++");
   		System.out.println("++                      ++");
   		System.out.println("++   LAB 10 Recursion   ++");
   		System.out.println("++                      ++");
   		System.out.println("++++++++++++++++++++++++++\n");

   		System.out.println("\nProgrammer JBudd");
   		System.out.println("Lab 11 Recursion");
   		System.out.println("16 April 2017\n");
		
		for (int index = 0; index < myArray.length; index++)
		{
			Random rand = new Random();
			
			int previousGuess = rand.nextInt(myArray[0] + 1) + 1;
			
			System.out.println("\nNumber: " + myArray[index] + "... First Guess: " + previousGuess + "\n");
			
			double sqrtNum = FindTheRoot(previousGuess, myArray[index]);
			
			System.out.printf("%s%d%s%.4f\n" , "The square root of " , myArray[index] , " is: " , sqrtNum);
			
		}//end for loop	

	}//end main method
	
	public static double FindTheRoot(double newPreviousGuess, int newArrayNum)
	{
		double nextGuess = (newPreviousGuess + (newArrayNum / newPreviousGuess)) / 2;
		
		if ((newPreviousGuess - nextGuess) < 0.00001)
			return nextGuess;
		else
		{
			System.out.printf("%s%.4f\n" , " Next Guess " , nextGuess);
			double tempNum = FindTheRoot( nextGuess, newArrayNum);
			return tempNum;
		}//end else
			
	}//end FindTheRoot method

}//end SquareRootCalculator class
