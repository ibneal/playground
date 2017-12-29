import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestTheUtility {
	@Test
	public void testPrime() {
		int[] result = Utility.factorIt(21);
		int[] test = new int[2];
		test[0]=7;
		test[1]=3;
		System.out.println(test[0]);
		System.out.println(test[1]);
		System.out.println(result[0]);
		System.out.println(result[1]);
		assertEquals(test.toString(),result.toString());
	}
	
}
