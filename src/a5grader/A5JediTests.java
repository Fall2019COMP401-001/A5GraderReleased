package a5grader;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

import a5.*;

import java.util.ArrayList;
import java.util.List;

public class A5JediTests {
	
	@Test
	public void testAddDuplicates() {
		System.out.println("Testing if roll constructor combines duplicates");
		String name = "yummy";
		double tuna_amt = 1.2;
		double rice_amt = 0.33;
		double seaweed_amt = 0.25;
		double avocado_amt = 0.75;

		// Create ingredient portion array with amounts above but with
		// two rice portions in the array.
		
		// Create a roll with the array.

		// Retrieve the ingredients back from the roll using getIngredients.
		
		// Confirm that there is only one rice portion and that the associated
		// amount is 2.0*0.33 to withing 0.01.

		// Confirm the cost of the roll is 2.98 to within 0.01
	}
	
	
	@Test
	public void testAddSeaweedIfNot(){
		System.out.println("Testing is roll constructor adds seaweed if there isn't enough in ingredients given to constructor");
		String name = "yummy";
		double tuna_amt = 1.2;
		double rice_amt = 0.33;
		double avocado_amt = 0.75;

		// Create ingredient portion array with amounts above.
		
		// Create roll
		
		// Retrieve ingredients back from roll using getIngredients().
		
		// Make sure length of roll ingredients is 4 (should be if seaweed properly added)
		
		// Confirm one of the ingredients is seaweed.
		
		// Test getCalories() of roll for returning 104 (should be exaclty this if
		// seaweed properly added).
	}

	@Test
	public void testAddEnoughSeaweedIfNot(){
		System.out.println("Testing if roll constructor detects that enough seaweed is in ingredients");
		String name = "yummy";
		double tuna_amt = 1.2;
		double rice_amt = 0.33;
		double seaweed_amt = 0.05;
		double avocado_amt = 0.75;

		// Create portion array with amounts above.

		// Create roll

		// Retrieve ingredients back from roll
		
		// Confirm one of the ingredients is seaweed.
		
		// Test getCalories() of roll for returning 104 (should be exaclty this if
		// seaweed amount properly adjusted).
	}
	
}
