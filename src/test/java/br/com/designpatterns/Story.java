package br.com.designpatterns;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;

import br.com.designpatterns.Budget;
import br.com.designpatterns.ICCC;
import br.com.designpatterns.ICMS;
import br.com.designpatterns.ISS;
import br.com.designpatterns.TaxationCalculator;

public abstract class Story {

	protected GivenSteps given;
	protected WhenSteps when;
	protected ThenSteps then;

	@Before
	public void setUp() {
		given = new GivenSteps();
		when = new WhenSteps();
		then = new ThenSteps();
	}

	public class GivenSteps {

		public Budget iHaveFiveHundredBudget() {
			return new Budget(500.0);
		}
		
		public Budget iHaveOneThousandAndFiveHundredBudget() {
			return new Budget(1500.0);
		}
		
		public Budget iHaveThreeThousandAndOne() {
			return new Budget(3001.0);
		}
	}

	public class WhenSteps {

		private final TaxationCalculator calculator;

		public WhenSteps() {
			this.calculator = new TaxationCalculator();
		}

		public double calculateIcms(Budget budget) {
			return this.calculator.performsCalculation(budget, new ICMS());
		}

		public double calculateIss(Budget budget) {
			return this.calculator.performsCalculation(budget, new ISS());
		}
		
		public double calculateIccc(Budget budget) {
			return this.calculator.performsCalculation(budget, new ICCC());
		}
	}

	public class ThenSteps {
		public void theTaxationAmountShouldBe(Budget budget, double taxationValue, double percentageTax) {
			assertThat(budget.getValue() * percentageTax, equalTo(taxationValue));
		}
		
		public void theTaxationAmountShouldBe(Budget budget, double taxationValue, double percentageTax, double increase) {
			assertThat((budget.getValue() * percentageTax) + increase, equalTo(taxationValue));
		}
	}
}
