
public class Invoice {
	private String brand;
	private String description;
	private int quantity;
	private double price;
	
	
	Invoice(String brand,String description,int quantity,double price){
		setBrand(brand);
		setDescription(description);
		setQuantity(quantity);
		setPrice(price);
	}
	
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setDescription(String description) {
		this.description=description;
	}
	public String getDescription() {
		return this.description;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return this.price;
	}
	
}
