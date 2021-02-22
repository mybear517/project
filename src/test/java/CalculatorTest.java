import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {

		private static Calculator calcObj = new Calculator();
		public static void setup() {
			calcObj = new Calculator();
			System.out.println(" setup");
		}
 @AfterAll
 public static void cleanUp() {
	 calcObj = null;
	 System.out.println(" ==== After All =====");
 }
 @BeforeEach
 public void beforeEachTest() {
	 System.out.println(" before Test");
 }
 @Test
 public void test1() {
	  int a = 100;
	  int b = 200;
	  int expectedResult = a+b;
	  int actualResult = calcObj.add(a, b);

	  assertEquals(expectedResult, actualResult);
	  
 }

}
