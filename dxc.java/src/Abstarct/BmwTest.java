package Abstarct; 
import org.junit.Test;

import junit.framework.TestCase;

public class BmwTest  extends TestCase {
	
				@Test
				public void testAdd() {
					int expected =30;
					int actual = BmwFlyingCar.add(10,20);
					//asseretEquals(expected, actual);
				}
				@Test
				public void testElgibility() {
					//boolean expected = false;
					boolean actual = BmwFlyingCar.isEligibletoVote(18);

					//assertFalse(actual);
					assertTrue(actual);
				}

		}
	
	


