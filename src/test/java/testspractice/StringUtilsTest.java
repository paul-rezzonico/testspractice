package testspractice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	void test() {
		assertTrue(true);
	}

	@Test
	void should_be_a_palindrome_with_an_even_nb_of_letter() {
		String palindrome = "RiassaiR";
		
		assertTrue(StringUtils.isPalindrome(palindrome));
	}
	
	@Test
	void should_be_a_palindrome_with_an_no_even_nb_of_letter() {
		String palindrome = "KayaK";
		
		assertTrue(StringUtils.isPalindrome(palindrome));
	}
	
}
