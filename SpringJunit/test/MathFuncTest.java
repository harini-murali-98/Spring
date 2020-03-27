import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MathFuncTest {

	
	
	@Test
	void testSum() {
		MathFunc mathFunc = new MathFunc();
	assertFalse(mathFunc.sum(new int[] {2}) == false);
	
	}

}
