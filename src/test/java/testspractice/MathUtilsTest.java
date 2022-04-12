package testspractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void should_divise_the_number1_with_the_number_two_and_return_true() {
		int number1 = 6;
		int number2 = 3; 
		
		assertTrue(MathUtils.isDivisibleBy(number2, number1));
	}
	
	@Test
	void should_not_divise_the_number1_with_the_number_two_and_return_false() {
		int number1 = 4;
		int number2 = 3; 
		
		assertFalse(MathUtils.isDivisibleBy(number2, number1));
	}
	
}
