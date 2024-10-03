package model;

public class ICMS extends Tax {

	private String UFFrom;
	private String UFTo;
	
	public ICMS(String from, String to) {
		this.UFFrom = from;
		this.UFTo = to;
	}
	
	@Override
	public Double calculate(Item item) {
		
		Double icms = DataBaseMock.selectICMS(UFFrom+UFTo);
		
		return item.getValue() * icms;
	}

	@Override
	public String getName() {
		return "ICMS";
	}
}
