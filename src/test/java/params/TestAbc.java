package params;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

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
	 * @ParameterizedTest: đây là dang test case @test có chứa params lấy từ @ValueSource
	 * 
	 *  https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests
	 *  strings = string[]
	 *  chỗ này tạo ra 3 testcase ứng với 3 giá trị khác nhau
	 *  (có thể điền dữ liệu từ nhiều nguồn khác nhau: csv, method... xem tài liệu)
	 */
	@ParameterizedTest
	@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
	void testParameters1(String candidate) {
		
		Assertions.assertTrue(StringUtils.isNotBlank(candidate));
	}
	
	/**
	 * @ParameterizedTest: đây là dang test case @test có chứa params lấy từ @ValueSource
	 * longs = long[]
	 * chỗ này tạo ra 4 testcase ứng với 4 giá trị khác nhau
	 */
	@ParameterizedTest
	@ValueSource(longs = { 1,2, 3, 7 })
	void testParameters2(long params) {
		
		Assertions.assertTrue(params > 0);
	}
	

}
