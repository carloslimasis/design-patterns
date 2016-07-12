package br.com.designpatterns.strategy;

public interface Discount {

	double deducts(Budget budget);
	void setNext(Discount next);
	
}
