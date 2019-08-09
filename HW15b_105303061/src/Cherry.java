//子
public class Cherry extends Fruit{  	//繼承的子類別必須實作 abstract 方法
	Cherry(double price,int quantity){
		super(price,quantity);
		
	}
	public double calc() {
		double tax= 0.1;
		return getprice()*getquantity()*(1+tax);
	}
}
