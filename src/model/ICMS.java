package model;

public final class ICMS implements Tax{
	private ICMSAliquot aliquot;
	
	public ICMS(ICMSAliquot aliquot) {
		this.aliquot = aliquot;
	}
	
	@Override
	public double calculateTax(double value) {
		return aliquot.getAliquot() * value;
	}
}
