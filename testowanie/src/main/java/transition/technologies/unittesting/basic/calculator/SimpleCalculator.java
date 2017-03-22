/**
 * Copyright (c) 2015 Transition Technologies S.A. All Rights Reserved.
 * 
 * This software is the confidential and proprietary information of Transition Technologies S.A.
 * and is subject to the terms of a software license agreement. You shall
 * not disclose such confidential information and shall use it only in accordance
 * with the terms of the license agreement.
 * 
 */
package transition.technologies.unittesting.basic.calculator;

public class SimpleCalculator {
	
	public double add(double number1, double number2) {
	
		return number1 + number2;
	}
	
	public double subtract(double number1, double number2) {
		return number1 - number2;
	}
	
	public double divide(double numerator, double denumetator) throws CannotDivideByZeroException {
		if (denumetator == 0.0d) {
			throw new CannotDivideByZeroException();
		}
		
		return numerator / denumetator;
	}
	
	public double calculateSquareRoot(double number) throws CannotCalculateSquareRootOfNegativeNumber {
		
		if (number < 0) {
			throw new CannotCalculateSquareRootOfNegativeNumber(number);
		}
		
		return Math.sqrt(number);
		
	}
	
}
