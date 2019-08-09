
public class Room {
	String type;
	private String ID;
	private String name;
	protected int price;
	private boolean isOneTimePayment;
	
	public Room(String ID,String name,int price,boolean isOneTimePayment) {
		this.type=type;
		this.ID=ID;
		this.name=name;
		this.price=price;
		this.isOneTimePayment=isOneTimePayment;
		
	}
	public String getType() {
		return this.type;
	}
	public String getID() {
		return this.ID;
	}
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		this.price=this.price*12;
		if(this.isOneTimePayment)
			this.price=(int) (this.price*0.9);
		if(this.type.equals("Condo"))this.price=(int)getPriceForYear();
		return this.price;
	}
	
	public boolean getIsOneTimePayment() {
		return this.isOneTimePayment;
	}
	
	public double getPriceForYear(){
		return this.price;
	}
	public String toString(){
		return getType()+": the total price for Room NO."+getID()+" "+getName()+" rent is "+getPrice();
	}
	
	
}
