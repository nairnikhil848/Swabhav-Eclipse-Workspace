package ExternalLibraries;

public class Hat {
	private String shortName;
	private String longName;
	private double basePrice;
	
	public Hat(String lname,String sname,double price) {
		this.longName = lname;
		this.shortName = sname;
		this.basePrice = price;
	}
	public double getPrice() {
		return basePrice;
		
	}
	public String getLongName() {
		return longName;
	}
	public String getShortName() {
		return shortName;
	}
}
