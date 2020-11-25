package assignment4;

public class Shop {
	int id;
	String name;
	double revenue;
	int gstNumber;
	public Shop() {
		super();
	}
	public Shop(int id, String name, double revenue, int gstNumber) {
		super();
		this.id = id;
		this.name = name;
		this.revenue = revenue;
		this.gstNumber = gstNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	public int getGstNumber() {
		return gstNumber;
	}
	public void setGstNumber(int gstNumber) {
		this.gstNumber = gstNumber;
	}
	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", revenue=" + revenue + ", gstNumber=" + gstNumber + "]";
	}
	

}
