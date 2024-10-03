package model;

public class Product extends Item {
	private Double insurance;
	private Double shipping;
	private Double profits;
	
	public Product(String name, Double value, Double profits) {
		super(name, value);
		this.profits = profits/100;
		this.insurance = 0.0;
		this.shipping = 0.0;
	}
	
	@Override
	public Double finalPrice() {
		Double totalTaxes = 0.0;
		
		for (Tax t : taxes)
			totalTaxes += t.calculate(this);
		
		Double costs = getValue() + totalTaxes;
		Double profitsValue = costs * profits; 
		
		return costs + profitsValue;
	}
	
	public void setInsurance(Double insurance) {
		this.insurance = insurance;
	}
	
	public void setShipping(Double shipping) {
		this.shipping = shipping;
	}
	
	public Double getInsurance() {
		return insurance;
	}
	
	public Double getShipping() {
		return shipping;
	}
}
