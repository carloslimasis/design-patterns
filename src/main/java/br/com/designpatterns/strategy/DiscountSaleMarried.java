package br.com.designpatterns.strategy;

public class DiscountSaleMarried implements Discount {

	private Discount next;
	
	@Override
	public double deducts(Budget budget) {
		if(existsItem("LAPIS", budget) && existsItem("CANETA", budget)) {
			return budget.getValue() * 0.05;
		} 
		return this.next.deducts(budget);
	}

	@Override
	public void setNext(Discount next) {
		this.next = next;
	}

	private boolean existsItem(String name, Budget budget) {
		return budget.getItens().stream().filter(item -> item.getName().equals(name)).findAny().isPresent();
    }
}
