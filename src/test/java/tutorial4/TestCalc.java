package tutorial4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalc {
	@Test
		 
		   public void testAdd() {
		   assertEquals(8, new Calc().add(4,4)); 
		  }
		}