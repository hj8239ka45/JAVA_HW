//�l
public class Papaya extends Fruit{  	//�~�Ӫ��l���O������@ abstract ��k
	Papaya(double price,int quantity){
		super(price,quantity);
	}
	public double calc() {
		return getprice()*getquantity();
	}
}
