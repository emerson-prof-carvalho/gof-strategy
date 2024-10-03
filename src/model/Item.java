package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Item {
	private String name;
	private Double value;
	protected List<Tax> taxes;
	
	public Item(String name, Double value) {
		this.name = name;
		this.value = value;
		taxes = new ArrayList<>();
	}
	
	public Boolean addTax(Tax tax) {
		if (tax == null)
			return false; 
		
		if (!taxes.contains(tax))
			return taxes.add(tax);
		
		return false;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getValue() {
		return value;
	}
	
	public abstract Double finalPrice();
}
