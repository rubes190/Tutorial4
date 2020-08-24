package tutorial4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class SumTest {
	@Test
	
	
		public void testSub() {
			assertEquals(8, new Calc().subtract(10,2) );
		}
}