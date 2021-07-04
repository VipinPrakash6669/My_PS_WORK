package remote_control_vipin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ACTest {

	@Test
	void test() {
		AC ac=new AC(25);
		int a=30;
		int x=ac.changetemp(5);
		assertEquals(30, x);
	}

}
