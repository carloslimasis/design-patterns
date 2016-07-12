package br.com.designpatterns.strategy;

public class DiscountMoreThanFiveItems implements Discount {

	private Discount next;

	@Override
	public double deducts(Budget budget) {
		if (budget.getItens().size() > 5) {
			return budget.getValue() * 0.1;
		} 
		return next.deducts(budget);
	}

	public void setNext(Discount next) {
		this.next = next;
	}

}
