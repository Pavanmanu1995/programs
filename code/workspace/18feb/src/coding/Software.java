package coding;

public class Software {
	private int id;
	private int licenseNumber;
	private String name;
	private double cost;

	public Software() {
		super();
	}

	public Software(int id, int licenseNumber, String name, double cost) {
		super();
		this.id = id;
		this.licenseNumber = licenseNumber;
		this.name = name;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(int licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Software [id=" + id + ", licenseNumber=" + licenseNumber + ", name=" + name + ", cost=" + cost + "]";
	}
}
