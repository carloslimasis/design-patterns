package br.com.designpatterns;

import org.junit.Test;

import br.com.designpatterns.Budget;
import br.com.designpatterns.ICCC;
import br.com.designpatterns.ICMS;
import br.com.designpatterns.ISS;

public class TestStrategy extends Story {
	
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
	
	@Test
	public void calculateIcccLessThanThousand() {
		Budget budget = given.iHaveFiveHundredBudget();
		double taxationValue = when.calculateIccc(budget);
		then.theTaxationAmountShouldBe(budget, taxationValue, ICCC.FIVE_PER_CENT);
	}
	
	@Test
	public void calculateIcccBetweenOneThousandThreeThousand() {
		Budget budget = given.iHaveOneThousandAndFiveHundredBudget();
		double taxationValue = when.calculateIccc(budget);
		then.theTaxationAmountShouldBe(budget, taxationValue, ICCC.SEVEN_PER_CENT);
	}
	
	@Test
	public void calculateIcccGreaterThanThreeThousand() {
		Budget budget = given.iHaveThreeThousandAndOne();
		double taxationValue = when.calculateIccc(budget);
		then.theTaxationAmountShouldBe(budget, taxationValue, ICCC.EIGHT_PER_CENT, ICCC.INCREASE);
	}
}

