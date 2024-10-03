package model;

public abstract class Tax {
	public abstract Double calculate(Item item);
	public abstract String getName();
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		if (!(obj instanceof Tax))
			return false;
		
		Tax fromObj = (Tax) obj;
		
		if (this.getName() == fromObj.getName())
			return true;
		
		return this.getName().equals(fromObj.getName());
	}
}
