
public class Condo extends Room{
	public Condo(String ID,String name,int price,boolean isOneTimePayment) {
		super(ID,name,price,isOneTimePayment);
		type="Condo";
	}
	public double getPriceForYear(){
		
		return this.price*1.05;
	}
	
}
