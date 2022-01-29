package repeat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

/**
 * https://junit.org/junit5/docs/current/user-guide/
 *  maven-surefire-plugin sẽ tự động scan các file theo pattern sau:
 * 			** /Test*.java -->
			** /*Test.java -->
			** /*Tests.java -->
			** /*TestCase.java -->
 */
public class TestRepeat {
	
	/**
	 * @Test sẽ run như 1 testCase độc lập giống hàm main(){}
	 */
	@RepeatedTest(10)
	void myFirstTest() {
		/**
		 * tất cả các function do Assertions class quản lý: Assertions.*
		 */
		Assertions.assertEquals(2, 1+1);
	}
	

}
