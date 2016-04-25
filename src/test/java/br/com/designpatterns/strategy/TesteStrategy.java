package br.com.designpatterns.strategy;

import org.junit.Test;

public class TesteStrategy extends Story {
	
	@Test
	public void calculateICMS() {
		Budget budget = given.iHaveFiveHundredBudget();
		double taxationValue = when.calculateIcms(budget);
		then.theTaxationAmountShouldBe(budget, taxationValue, ICMS.PERCENTAGE_TAX);
	}
	
	@Test
	public void calculateISS() {
		Budget budget = given.iHaveFiveHundredBudget();
		double taxationValue = when.calculateIss(budget);
		then.theTaxationAmountShouldBe(budget, taxationValue, ISS.PERCENTAGE_TAX);
	}
}

