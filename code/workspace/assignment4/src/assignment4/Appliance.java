package assignment4;

public class Appliance {
	private int applianceId;
	private String applianceName;
	private double price;
	public Appliance() {
		super();
	}
	public Appliance(int applianceId, String applianceName, double price) {
		super();
		this.applianceId = applianceId;
		this.applianceName = applianceName;
		this.price = price;
	}
	public int getApplianceId() {
		return applianceId;
	}
	public void setApplianceId(int applianceId) {
		this.applianceId = applianceId;
	}
	public String getApplianceName() {
		return applianceName;
	}
	public void setApplianceName(String applianceName) {
		this.applianceName = applianceName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Appliance [applianceId=" + applianceId + ", applianceName=" + applianceName + ", price=" + price + "]";
	}
	
	

}
