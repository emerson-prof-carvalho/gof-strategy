package model;

public class Service extends Item {

	public Service(String name, Double value) {
		super(name, value);
	}

	@Override
	public Double finalPrice() {
		Double totalTaxes = 0.0;
		
		for (Tax t : taxes)
			totalTaxes += t.calculate(this);
		
		return getValue() + totalTaxes;
	}
}
