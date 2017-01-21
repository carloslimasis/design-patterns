package br.com.designpatterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Budget {

	private final double value;
	private List<Item> itens;

	public Budget(double value) {
		this.value = value;
		this.itens = new ArrayList<>();
	}

	public double getValue() {
		return value;
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public void addItem(Item item) {
		this.itens.add(item);
	}
	
}
