//��
public abstract class Fruit {
	private double price;
	private int quantity;
	Fruit(double price,int quantity){
		setprice(price);
		setquantity(quantity);
	}
	public void setprice(double price) {
		this.price=price;
	}
	public void setquantity(int quantity) {
		this.quantity=quantity;
	}
	public double getprice() {
		return this.price;
	}
	public double getquantity() {
		return this.quantity;
	}
	public abstract double calc();//�ŧi�� abstract ����k���ݭn��@�A��᪽���[����
}
