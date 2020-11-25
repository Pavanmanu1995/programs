package assignment3;

public class Product {

	int productId;
	String productName;
	double productPrice;
        
	public Product() {
	}

	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product obj = new Product();
		Product ob = new Product(1,"QWERTY",23.435);
		obj.getProductPrice();
		obj.setProductName("Pizza");
	}

}
