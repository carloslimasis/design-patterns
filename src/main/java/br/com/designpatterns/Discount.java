package br.com.designpatterns;

public interface Discount {

	double deducts(Budget budget);
	void setNext(Discount next);
	
}
