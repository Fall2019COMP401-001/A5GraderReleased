package a5grader;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

import a5.*;

public class A5NoviceTests {
	
	@Test
	public void testAvocado() {
		System.out.println("Testing Avocado ingredient");
		
		String name = "avocado";
		double price = 0.24;
		int cals = 42;
		boolean veg = true;
		boolean rice = false;
		boolean shell = false;
		
		Ingredient i = new Avocado();
		assertEquals(name, i.getName());
		assertEquals(price, i.getPricePerOunce(), 0.01);
		assertEquals(cals, i.getCaloriesPerOunce());
		assertEquals(cals/price, i.getCaloriesPerDollar(), 0.01);
		assertEquals(veg, i.getIsVegetarian());
		assertEquals(rice, i.getIsRice());
		assertEquals(shell, i.getIsShellfish());
	}
	
	@Test
	public void testAvocadoPortion() {
		System.out.println("Testing AvocadoPortion");

		double amt = Math.random() + 1.0;

		IngredientPortion p = new AvocadoPortion(amt);
		Ingredient i = new Avocado();
		
		assertTrue(i.equals(p.getIngredient()));
		assertEquals(amt, p.getAmount(), 0.00001);
		assertEquals(amt*i.getPricePerOunce(), p.getCost(), 0.0001);
		assertEquals(amt*i.getCaloriesPerOunce(), p.getCalories(), 0.0001);
		assertEquals(i.getIsVegetarian(), p.getIsVegetarian());
		assertEquals(i.getIsRice(), p.getIsRice());
		assertEquals(i.getIsShellfish(), p.getIsShellfish());
	}


	@Test
	public void testEquals(){
		System.out.println("Testing equals method of an ingredient.");

		// Create two Avocado instances, a1 and a2.
		
		// Create a Crab instance, c
		
		// Make sure that calling a1's equal method with a2 is true.
		
		// Make sure that calling a2's equal method with a1 is true.

		// Make sure that calling a1's equals method with c is false.

		// Make sure that calling c's equals method with a1 is false.
	}
	
	@Test
	public void testCombine(){
		System.out.println("Testing combine method of an ingredient portion");
		
		// Create two avocado portions of differing amounts.
		
		// Use the combine method of one with the other to create a new portion.
		
		// Test that the amount of the combined avocado portion result is the
		// same as the two amounts used to create the original portions added together
		// within a margin of 0.0001
		
		// Confirm that Ingredient returned by new portion's getIngredient method
		// is equal to a new Avocado object using the equals method.
	}
	
	@Test
	public void testBadCombine(){
		System.out.println("Testing whether combin method throws exception if attempted with two different ingredient types");

		// Create an avocado portion of some amount
		
		// Create a crab portion of some amount.
		
		try {
			// Try to combine avocado portion with crab portion.

			// If we get here, then we didn't throw an exception.
			// Fail the test.
		}
		catch(IllegalArgumentException e) {
			// This is what we expect. Just return or do nothing.
		}
		catch(Exception e) {
			// Threw an exception, but not the right one. Fail the test.
		}
	}
	

	@Test
	public void testBadAmount(){
		System.out.println("Testing ingredient portion constructors for throwing exception if amount is illegal");

		try {
			// Try to create an Avocado ingredient portion with a negative amount.
			
			// If we get here, fail the test.
		} catch (RuntimeException e) {
			// This is what we expect. Do nothing.
		}
		
		// Repeat above for all the other ingredient types.
	}
	

}
