package model;

public class ISS extends Tax {

	private String municipality;
	
	public ISS(String municipality) {
		this.municipality = municipality;
	}
	
	@Override
	public Double calculate(Item item) {
		
		Double iss = DataBaseMock.selectISS(municipality);
		
		return item.getValue() * iss;
	}

	@Override
	public String getName() {
		return "ISS";
	}
}
