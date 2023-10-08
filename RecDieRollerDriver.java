/**
 * This class instantiates instances of RecDieRoller and rolls some dice.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-215 Module 3 Lab 1)
 * Fall 2023 (10/08/2023)
 */
public class RecDieRollerDriver {
	public static void main(String[] args) {
		RecDieRoller die = new RecDieRoller(); //new RecDieRoller object die created.
		die.roll(); //original roll method, rolls until a 2 is rolled. 0.0044% chance of 55 or more rolls happen.
		die.roll2(); //updated roll method, rolls 1000 times
	}//end main()
}//end RecDieRollerDriver class