//�l
public class Pineapple extends Fruit{  	//�~�Ӫ��l���O������@ abstract ��k
	Pineapple(double price,int quantity){
		super(price,quantity);
	}
	public double calc() {
		return getprice()*getquantity();
	}
}
