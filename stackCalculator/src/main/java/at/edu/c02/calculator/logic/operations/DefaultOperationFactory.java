package at.edu.c02.calculator.logic.operations;

import at.edu.c02.calculator.Calculator;
import at.edu.c02.calculator.MathOperation;
import at.edu.c02.calculator.OperationFactory;

import static at.edu.c02.calculator.Calculator.Operation.mod;

public class DefaultOperationFactory implements OperationFactory {

	public  MathOperation getOperation(Calculator.Operation op) {
		switch (op) {
			case add:
				return new Add();
			case sub:
				return new Sub();
			case div:
				return new Div();
			case mul:
				return new Mul();
			case mod:
				return new Mod();
		}

		return null;
	}
}
