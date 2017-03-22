package com.technologies.transition.codesmells.switches;

public class TaxCalculator {

	private static final double SCTAX = 0.5;
	private static final double ALTAX = 0.3;
	private static final double GATAX = 0.4;

	public double calculateTax(String stateCode, double price) {
		
		double tax = 0.0;
		
		switch (stateCode) {
			case "SC" :
			{
				return price * SCTAX;
			}
			case "AL" :
			{
				return price * ALTAX;
			}
			case "GA" :
			{
				return price * GATAX;
			}
		
		}
		
		return tax;
	}
	
}
