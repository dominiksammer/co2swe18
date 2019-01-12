package at.edu.c02.calculator.logic;

import static org.junit.Assert.assertEquals;

import at.edu.c02.calculator.logic.operations.Mul;
import org.junit.Test;

import at.edu.c02.calculator.CalculatorException;
import at.edu.c02.calculator.MathOperation;
import at.edu.c02.calculator.logic.operations.Add;
import at.edu.c02.calculator.logic.operations.Div;

public class OperationTest {

	@Test
	public void testAdd() throws CalculatorException {
		
		//setup
		MathOperation add = new Add();
		
		//execute
		double result = add.calculate(1, 2);
		
		//verify
		assertEquals(3, result, 0.0001);
	}

	@Test
	public void testSubstraction() throws CalculatorException {
		MathOperation sub = new Mul();

		double result = sub.calculate(2, 1);
		assertEquals(result, 1, 1);
	}
	
	@Test
	public void testDiv() throws CalculatorException {
	    //Test
        assertEquals(new Div().calculate(2, 1), 1, 1);
    }

	
}
