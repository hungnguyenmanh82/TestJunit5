package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * https://junit.org/junit5/docs/current/user-guide/
 *  maven-surefire-plugin sẽ tự động scan các file theo pattern sau:
 * 			** /Test*.java -->
			** /*Test.java -->
			** /*Tests.java -->
			** /*TestCase.java -->
 */
public class TestAbc {
	
	/**
	 * @Test sẽ run như 1 testCase độc lập giống hàm main(){}
	 */
	@Test
	void myFirstTest() {
		/**
		 * tất cả các function do Assertions class quản lý: Assertions.*
		 * Dù biến tấu thế nào đi nữa thì Assertions bản chất là phép so sánh bằng
		 * giữa expectedValue và actualValue 
		 */
		Assertions.assertEquals(2, 1+1);
		
		// nhiều assertions trong 1 test case ok
		// có thể add message vào assertions để hiển thị thông tin
		Assertions.assertEquals(2, 1,"message thong báo lỗi");
	}
	
	@Test
	void testTrueFalse() {
		/**
		 * tất cả các function do Assertions class quản lý: Assertions.*
		 */
		boolean result = true;
		Assertions.assertTrue(result);
	}
}
