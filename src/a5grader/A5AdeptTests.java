package a5grader;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import a5.*;
import a5.Sashimi.SashimiType;
import a5.Nigiri.NigiriType;


public class A5AdeptTests {


	@Test
	public void testSashimiGetName(){
		System.out.println("Testing sashimi getName");

		Sushi sashimi1 = new Sashimi(SashimiType.TUNA);
		assertEquals("tuna sashimi", sashimi1.getName());
		
		// Repeat above for the other kinds of sashimi

	}

	@Test
	public void testNigiriGetName(){
		System.out.println("Testing nigiri getName");

		Nigiri nigiri1 = new Nigiri(NigiriType.TUNA);
		assertEquals("tuna nigiri", nigiri1.getName());
		
		// Repeat above for the other kinds of nigiri
	}

	@Test
	public void testSashimiGetCalories(){
		System.out.println("Testing sashimi getCalories");

		Sushi sashimi1 = new Sashimi(SashimiType.TUNA);
		assertEquals(Math.round(0.75*42), sashimi1.getCalories());
		
		// Repeat above for the other kinds of Sashimi using the appropriate
		// values to calculate the expected result.
	}

	@Test
	public void testNigiriGetCalories(){
		System.out.println("Testing nigiri getCalories");

		Nigiri nigiri1 = new Nigiri(NigiriType.TUNA);
		assertEquals(Math.round(0.75*42+0.5*34), nigiri1.getCalories());
		
		// Repeat above for the other kinds of Nigiri using the appropriate
		// values to calculate the expected result.
	}

	
	@Test
	public void testSashimiGetCost(){
		System.out.println("Testing sashimi getCost");

		Sushi sashimi1 = new Sashimi(SashimiType.TUNA);
		assertEquals(((int) (0.75*1.67*100.0+0.5))/100.0, sashimi1.getCost(), 0.01);

		// Repeat above for the other kinds of Sashimi using the appropriate
		// values to calculate the expected result.
}

	@Test
	public void testNigiriGetCost(){
		System.out.println("Testing nigiri getCost");

		Nigiri nigiri1 = new Nigiri(NigiriType.TUNA);
		assertEquals(((int) ((0.75*1.67+0.5*0.13)*100.0+0.5))/100.0, nigiri1.getCost(), 0.01);

		// Repeat above for the other kinds of Nigiri using the appropriate
		// values to calculate the expected result.
	}

	@Test
	public void testSashimiGetIngredients(){
		System.out.println("Testing sashimi getIngredients");

		Sushi sashimi1 = new Sashimi(SashimiType.SHRIMP);
		IngredientPortion[] ipa = sashimi1.getIngredients();
		assertNotNull(ipa);
		assertEquals(1, ipa.length);
		assertNotNull(ipa[0]);
		assertTrue(ipa[0].getIngredient().equals(new Shrimp()));
		assertEquals(0.75, ipa[0].getAmount(), 0.0001);

		// Repeat above for the other kinds of Sashimi using the appropriate
		// values to calculate the expected result.

	}

	@Test
	public void testNigiriGetIngredients(){
		System.out.println("Testing nigiri getIngredients");

		Ingredient rice = new Rice();

		Sushi nigiri1 = new Nigiri(NigiriType.SHRIMP);
		IngredientPortion[] ipa = nigiri1.getIngredients();
		assertNotNull(ipa);
		assertEquals(2, ipa.length);
		assertNotNull(ipa[0]);
		assertNotNull(ipa[1]);
		if (ipa[0].getIsRice()) {
			assertTrue(ipa[0].getIngredient().equals(rice));
			assertEquals(0.5, ipa[0].getAmount(), 0.0001);
			assertTrue(ipa[1].getIngredient().equals(new Shrimp()));
			assertEquals(0.75, ipa[1].getAmount(), 0.0001);
		} else {
			assertTrue(ipa[1].getIngredient().equals(rice));
			assertEquals(0.5, ipa[1].getAmount(), 0.0001);
			assertTrue(ipa[0].getIngredient().equals(new Shrimp()));
			assertEquals(0.75, ipa[0].getAmount(), 0.0001);
		}

		// Repeat above for the other kinds of Nigiri using the appropriate
		// values to calculate the expected result.
	}

	@Test
	public void testRollGetIngredients(){
		System.out.println("Testing roll getIngredients");

		//Roll Variables
		String name = "yummy";
		double tuna_amt = 1.2;
		double rice_amt = 0.66;
		double seaweed_amt = 0.25;
		double avocado_amt = 0.75;

		// Create an array of ingredient portions with a rice portion,
		// seaweed portion, avocado portion, and tuna portion given the
		// amounts above.
		
		// Create a roll using the ingredient portion array and roll name 
		// given above.

		// Retrieve the roll ingredients from the roll object.

		// Check to make sure the retrieved roll ingredients array is...
		// * not null
		// * has the correct length (i.e., 4)
		// * all elements are not null

		// We can't assume that the retrieved ingredients will have the
		// same order as the array we provided.
		
		// Create four boolean flags for whether we found the expected
		// individual portions of different ingredients.
		
		boolean found_rice = false;
		boolean found_tuna = false;
		boolean found_seaweed = false;
		boolean found_avocado = false;
		
		// For each ingredient in the retrieved ingredients, figure out
		// which one it is and then compare amount with expected amount
		// of that ingredient. If found and confirmed, then set corresponding
		// flag to be true.
				
		assertTrue(found_rice);
		assertTrue(found_seaweed);
		assertTrue(found_avocado);
		assertTrue(found_tuna);
	}

	@Test
	public void testRollGetCost(){
		System.out.println("Testing roll getCost");

		//Roll Variables
		String name = "yummy";
		double tuna_amt = 1.2;
		double rice_amt = 0.66;
		double seaweed_amt = 0.25;
		double avocado_amt = 0.75;

		// Create ingredient portion array with amounts from above.
		
		// Create roll

		// Test that cost of roll is what is expected (i.e., 2.98)
	}

	@Test
	public void testRollHasRice(){
		System.out.println("Testing roll hasRice if there is rice");

		// Create a roll with rice.
		
		// Make sure that roll's hasRice method returns true.
	}

	@Test
	public void testRollHasNoRice(){
		System.out.println("Testing roll hasRice if there is not rice");

		// Create a roll without rice.
		
		// Make sure that roll's hasRice method returns true.
	}

	@Test
	public void testRollGetName(){
		// Create a roll with a specific name.
		
		// Make sure getName() method returns expected name.
	}

	@Test
	public void testRollArrayClone(){
		System.out.println("Testing roll to make sure it clones array of ingredients passed to constructor and when returning from getIngredients");

		//Roll Variables
		String name = "yummy";

		AvocadoPortion avoPort = new AvocadoPortion(0.75);
		AvocadoPortion avoPort2 = new AvocadoPortion(0.12);
		SeaweedPortion seaweed = new SeaweedPortion(0.1);

		IngredientPortion[] ingredientPortion = {avoPort, seaweed};
		
		Roll roll1 = new Roll(name,ingredientPortion);

		IngredientPortion[] roll1Ingred = roll1.getIngredients();

		assertNotNull(roll1Ingred);
		assertEquals(2, roll1Ingred.length);
		assertNotEquals(ingredientPortion, roll1Ingred);

		assertNotNull(roll1Ingred[0]);
		assertNotNull(roll1Ingred[1]);

		// Avocado portion should be ingredient 0, but you never know
		int avo_idx = roll1Ingred[0].getIngredient().equals(avoPort.getIngredient()) ? 0 : 1;
		
	    assertEquals(0.75, roll1Ingred[avo_idx].getAmount(), 0.0001);

		ingredientPortion[avo_idx] = avoPort2;
		roll1Ingred = roll1.getIngredients();
		assertEquals(0.75, roll1Ingred[avo_idx].getAmount(), 0.0001);
	}

}
