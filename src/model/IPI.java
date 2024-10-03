package model;

public class IPI extends Tax{
	
	private String type;
	
	public IPI(String type) {
		this.type = type;
	}

	@Override
	public Double calculate(Item item) {
		Product p;
		try {
			p = (Product) item;
		} catch (Exception e) {
			throw new ClassCastException("Um produto era esperado");
		}

		Double baseValue = p.getValue() + p.getShipping() + 
				p.getInsurance();
		
		Double ipi = DataBaseMock.selectIPI(type);

		return baseValue * ipi;
	}

	@Override
	public String getName() {
		return "IPI";
	}
}
