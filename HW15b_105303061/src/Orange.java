//子
public class Orange extends Fruit{  	//繼承的子類別必須實作 abstract 方法
	Orange(double price,int quantity){
		super(price,quantity);
		
	}
	public double calc() {
		return getprice()*getquantity();
	}
}
