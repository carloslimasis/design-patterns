package br.com.designpatterns.strategy;

public class ICCC implements Taxation {

	public static final double INCREASE = 30.0;
	public static final double FIVE_PER_CENT = 0.05;
	public static final double SEVEN_PER_CENT = 0.07;
	public static final double EIGHT_PER_CENT = 0.08;

	@Override
	public double calculate(Budget budget) {

		double budgetValue = budget.getValue();
		
		if(budgetValue < 1000){
			return budgetValue * FIVE_PER_CENT;
		} else if(budgetValue > 1000 && budgetValue < 3000) {
			return budgetValue * SEVEN_PER_CENT;
		}
		
		return (budgetValue * EIGHT_PER_CENT) + INCREASE;
	}

}
