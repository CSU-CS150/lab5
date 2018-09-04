import java.util.Scanner;

/**
 * <h1> CS 150 - Lab 5 - Introduction to Methods with a Simple Investment Calculator
 * 
 * <h2> Topics Covered: </h2>
 * <ul>
 * 		<li>Scanner practice</li>
 * 		<li>Method usage</li>
 * 		<li>If conditional practice</li>
 * @author Jess Cobb <br>
 * Course: CS 150 - Fall 2018
 *@version 1.0_Fall 2018
 */

public class Lab5 {
	
	/**
	 * getInitialAmount() Students should only write code in the TODO section.
	 * This involves declaring and initializing a double called initialAmount 
	 * via the Scanner object.
	 * 
	 * @param keyboardInput The Scanner object; from main().
	 * @return intialAmount A double holding the dollar value the user begins their
	 * investment with (also known as the principal); returned to main().
	 */
	public double getInitialAmount(Scanner keyboardInput) {
		// TODO
		
		// end TODO
		
		if (initialAmount <= 0.0) {
			System.out.println("Invalid value entered for initial amount.");
			System.out.print("Please enter a value greater than 0.0: $");
			return getInitialAmount(keyboardInput);
		}
		
		return initialAmount;
	}
	
	/**
	 * getRetirementGoal() Students will need to write the entire method.
	 * This involves first writing the method signature, which has two parameters:
	 * a Scanner representing standard input and a double representing initial investment
	 * amount (i.e. principal). Next, students need to declare and initialize 
	 * a double representing the retirement goal amount via the Scanner object. 
	 * 
	 * Following this, a conditional block should be written, which will check for 
	 * invalid input. Inside one part of the conditional block, students should prompt 
	 * the user if a value less than or equal to zero was entered and write a return 
	 * statement which calls getRetirementGoal() again.
	 * 
	 * The other part of the conditional will catch the potential condition of a user
	 * entering a retirement goal amount less than the initial investment amount. Students
	 * will again prompt the user and write a return statement which call getRetirementGoal().
	 * The default condition of this conditional block simply returns the variable representing
	 * the user's retirement goal amount. 
	 * 
	 * @param keyboardInput The Scanner object; from main().
	 * @param principal A double representing initial investment amount; from main().
	 * @return A double holding the dollar value the user wishes to have at retirement;
	 * returned to main().
	 */

	// TODO
	
	// end TODO
	
	/**
	 * calcYearsToRetirementGoal() Students should not modify code in this method.
	 * This method utilizes the annual compound interest formula to calculate the
	 * time in years it will take to achieve a user's retirement goal provided a
	 * user's principal amount.
	 * 
	 * @param retirementAmount The user's input goal amount for retirement.
	 * @param principal The user's input for initial investment amount.
	 * @return timeInYears A double representing the amount of time in years until
	 * the retirement amount is reached, given a particular principal amount.
	 */
	public double calcYearsToRetirementGoal(double retirementGoal, double principal) {
		double years = -1.0, interestRate = 0.05, timesCmpndPerYear = 4;
		
		years = (Math.log(retirementGoal/principal) /
				Math.log(1.0 + interestRate/timesCmpndPerYear)) / timesCmpndPerYear;
		
		return years;
	} // end calcYearsToRetirementGoal()
	
	/**
	 * main() Students should only write one line of code in this method in the TODO section.
	 * @param args The String args is not utilized in this program.
	 */
	public static void main(String[] args) {
		// Local variables.
		Lab5 lab5 = new Lab5();
		Scanner input = new Scanner(System.in);
		
		// User prompt.
		//System.out.print("Enter the dollar amount of your principal (initial amount): $");
				
		// Call getInitialAmount() and assign a double called principal the method's return value.
		//double principal = lab5.getInitialAmount(input);
		
		// User prompt.
		//System.out.print("Enter the dollar amount of your retirement goal: $");
		
		// Call getRetirementGoal() and assign retirementAmount the method's return value.
		// TODO
		
		// end TODO
		
		// Calculate time in years to achieve retirement goal and print result to console.
		//double years = lab5.calcYearsToRetirementGoal(retirementGoal, principal);
		//System.out.printf("\nIn %.1f years, your investment will grow to $%.2f\n", years, retirementGoal);

	} // end main()

} // end class Lab5

