package test;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * https://junit.org/junit5/docs/current/user-guide/
 *  maven-surefire-plugin sẽ tự động scan các file theo pattern sau:
 * 			** /Test*.java -->
			** /*Test.java -->
			** /*Tests.java -->
			** /*TestCase.java -->
 * ---
 * Đây là ví dụ về 1 chuẩn testcase đc viết như sau
 */
public class StandardTests {

    /**
     * Khởi tạo ở đầu chương trình test trc nhất
     */
	@BeforeAll
    static void initAll() {
    }

    /**
     * khởi tạo trc mỗi testCase @test
     */
    @BeforeEach
    void init() {
    }

    /**
     * testcase success
     */
    @Test
    void succeedingTest() {
    	Assertions.assertEquals(3, 1+2);
    }
    
    /**
     * testcase failure => kết quả khác với kỳ vọng
     */
    @Test
    void failingTest1() {
    	Assertions.assertEquals(3, 2);
    }

    /**
     *   testcase failure => kết quả khác với kỳ vọng
     */
    @Test
    void failingTest2() {
    	// show message fail
    	Assertions.fail("a failing test");
    }

    /**
     * testcase error => vì throws exception ở runtime
     * runtime Exeption: member of Null point, chia 0, ...
     */
    @Test
    void errorTest1() {
    	int a = 10/0;
    	
    }
    
    /**
     * testcase error => vì throws exception ở runtime
     * runtime Exeption: member of Null point, chia 0, ...
     */
    @Test
    void throwExceptionTest2() {
    	/**
    	 * Nếu exception xảy ra như kỳ vọng thì testcase result = success
    	 * Ngược lại Exception type khác loại, hoặc ko có exception thì result = failure
    	 */
    	Assertions.assertThrows(Exception.class, () -> {
        	/**
        	 * runtime Exception xảy ra thì result = error  (ko phải failure)
        	 */
        	int a = 10/0; 
		});
    	
    }
    
    /**
     * loại bỏ testcase này ra khỏi việc test
     * result = skipped
     */
    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    /**
     * Assumptions.assumeTrue() là điểu kiện giả định cho test
     * Nếu điều kiện này ko thỏa mãn thì skip test case
     * result = skipped
     * ----------------
     * vd: testcase này chỉ giành cho Unix, ko dành cho window. vì thế trc khi test nó sẽ check Enviroment để xác định xem có chạy test case này ko
     *    Nếu là Enviroment là Window thì skip testcase này 
     */
    @Test
    void abortedTest() {
    	// sẽ check điều kiện nếu thỏa mãn mới chạy testcase này
    	// nếu ko thỏa mãn sẽ skip testcase này
    	Assumptions.assumeTrue("abc".contains("Z"));
    	
    	// sẽ run code này nếu code trên thỏa mãn và ko bị skip
    	Assertions.assertEquals(3, 1+2);
    }

    /**
     * kết thúc mỗi testcase thì chạy hàm này
     * vd: refresh lại dữ liệu để test cho testcase mới
     */
    @AfterEach
    void tearDown() {
    }

    /**
     * trc khi kết thúc toàn bộ chương trình thì chạy function này
     */
    @AfterAll
    static void tearDownAll() {
    }

}
