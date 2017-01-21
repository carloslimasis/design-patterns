package br.com.designpatterns;

public class WhithoutDiscount implements Discount {

	@Override
	public double deducts(Budget budget) {
		return 0;
	}

	@Override
	public void setNext(Discount next) {
		
	}

}
