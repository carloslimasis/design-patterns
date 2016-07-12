package br.com.designpatterns.strategy;

public class DiscountCalculator {

	public double calculate(Budget budget) {
		final DiscountMoreThanFiveItems firstDiscount = new DiscountMoreThanFiveItems();
		final DiscountMoreThanFiveHundred secondDiscount = new DiscountMoreThanFiveHundred();
		final DiscountSaleMarried thirdDiscount = new DiscountSaleMarried();
		final WhithoutDiscount whithoutDiscount = new WhithoutDiscount();
		
		firstDiscount.setNext(secondDiscount);
		secondDiscount.setNext(thirdDiscount);
		thirdDiscount.setNext(whithoutDiscount);
		
		return firstDiscount.deducts(budget);
	}
	
}
