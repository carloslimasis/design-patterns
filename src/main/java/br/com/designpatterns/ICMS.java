package br.com.designpatterns;

public class ICMS implements Taxation {

	public static final double PERCENTAGE_TAX = 0.05;

	@Override
	public double calculate(Budget budget) {
		return budget.getValue() * PERCENTAGE_TAX;
	}

}
