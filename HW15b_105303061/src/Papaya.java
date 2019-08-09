//子
public class Papaya extends Fruit{  	//繼承的子類別必須實作 abstract 方法
	Papaya(double price,int quantity){
		super(price,quantity);
	}
	public double calc() {
		return getprice()*getquantity();
	}
}
