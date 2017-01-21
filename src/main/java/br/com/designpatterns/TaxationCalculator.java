package br.com.designpatterns;

public class TaxationCalculator {
	
	public double performsCalculation(Budget budget, Taxation taxation) {
		return taxation.calculate(budget);
	}
	
}
