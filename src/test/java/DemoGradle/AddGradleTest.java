package DemoGradle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddGradleTest {
	private final AddGradle obj = new AddGradle();
	@Test
	void testSum() {
		assertEquals(5,obj.Add(2,3));
	}
	void testSumNegative() {
		assertNotEquals(7,obj.Add(2, 3));
	}
}
