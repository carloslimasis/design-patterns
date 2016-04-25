package br.com.designpatterns.strategy;

public class ISS implements Taxation {
	
	public static final double PERCENTAGE_TAX = 0.06;
	
	@Override
	public double calculate(Budget budget) {
		return budget.getValue() * PERCENTAGE_TAX;
	}

}
