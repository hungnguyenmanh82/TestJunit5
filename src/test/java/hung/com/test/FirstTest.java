package hung.com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * https://junit.org/junit5/docs/current/user-guide/
 * 
 */
public class FirstTest {
	
	@Test
	void myFirstTest() {
		
		Assertions.assertEquals(2, 1+1);
	}
}
