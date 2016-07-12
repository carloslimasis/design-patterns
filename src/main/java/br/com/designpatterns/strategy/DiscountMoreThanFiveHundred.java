package br.com.designpatterns.strategy;

public class DiscountMoreThanFiveHundred implements Discount {

	private Discount next;

	public double deducts(Budget budget) {
		if (budget.getValue() > 500.0) {
			return budget.getValue() * 0.07;
		} 
		return next.deducts(budget);
	}

	public void setNext(Discount next) {
		this.next = next;
	}
}
