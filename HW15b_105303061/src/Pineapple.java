//子
public class Pineapple extends Fruit{  	//繼承的子類別必須實作 abstract 方法
	Pineapple(double price,int quantity){
		super(price,quantity);
	}
	public double calc() {
		return getprice()*getquantity();
	}
}
