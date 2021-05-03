package application;

import framework.*;

import static framework.Asserts.assertEquals;

@TestClass
public class MyTest {
	Calculator calculator;
//	@Test
//	public void testMethod1() {
//		System.out.println("perform test method 1");
//	}
//
//	@Test
//	public void testMethod2() {
//		System.out.println("perform test method 2");
//	}
	@Before
	public void init() {
		calculator = new CalculatorImpl();
	}

	@Test
	public void testMethod1() {
		assertEquals(calculator.add(3),3);
		assertEquals(calculator.add(6),9);
	}
	@Test
	public void testMethod2() {
		assertEquals(calculator.add(3),3);
		assertEquals(calculator.subtract(6),-1);
	}

}
