package br.com.designpatterns.strategy;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class TestChainOfReponsability {

	@Test
	public void testChainOfResponsability() {
		final DiscountCalculator calculator = new DiscountCalculator();
		final Budget budget = new Budget(500.0);
		
		budget.addItem(new Item("CANETA", 500.0));
		budget.addItem(new Item("LAPIS", 250.0));

        double discount = calculator.calculate(budget);
        assertThat(discount, CoreMatchers.equalTo(25.0));
	}

}
