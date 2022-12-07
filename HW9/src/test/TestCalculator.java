package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		int expectedResult = 9; // 4+5=9
		int actualResult = calculator.add(4, 5);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		int expectedResult = 4; // 6-2=4; 
		int actualResult = calculator.sub(6, 2);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		int expectedResult = 16; // 4*4=16;
		int actualResult = calculator.multiply(4, 4);
		
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		float expectedResult = 4; // 20/5=4;
		float actualResult = calculator.divide(20, 5);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		assertThrows(ArithmeticException.class, () -> { calculator.divide(4, 0); });
	}
}
