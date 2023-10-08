/**
 * This class rolls dice in the form of generating a random number 1 through 6 for each time a die is rolled.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-215 Module 3 Lab 1)
 * Fall 2023 (10/08/2023)
 */
import java.util.Random;
public class RecDieRoller {
	/**
	 * This method generates a random integer from 0 to 5 when the "die" is rolled & adds 1 to match what a normal die outcomes.
	 * @return this method terminates once a 2 is rolled.
	 */

	Random die = new Random(); //Random variable die to be used to roll a "die" for a number 1 through 6.
	public void roll() {
		int result = die.nextInt(6) + 1; //generates random number 0 through 5 then adds 1 on the output.
		System.out.println(result); //prints random number
		if(result!=2) {
			roll(); //recursive call to itself when the result isn't a 2.
		}
		return;
	}//end roll()
	
	/**
	 * This method rolls a die 1000 times and counts how many rolls it takes to roll a 2 each time. 
	 */
	public void roll2() {
		int twos = 0; //int variable count to track number of times a 2 is rolled.
		int rolls = 0; //int variable to track number of rolls for each "2" rolled.
		for(int i =0; i<1000;i++) {
			int result = die.nextInt(6) + 1; //generates random number 0 through 5 then adds 1 on the output.
			if(result==2) {
				twos++; //increments twos counter by 1
				System.out.println("Number of rolls to get Two #"+ twos + ": " + rolls); //prints the rolls counter for the current "2" rolled.
				rolls = 0; //resets rolls counter each time a 2 is rolled.
			}//end if loop
			rolls++;
		}//end for loop
		System.out.printf("\nAverage number of rolls to get a 2: " + "%.2f",(1000.0/twos));
	}//end roll2()
}//end RecDieRoller class