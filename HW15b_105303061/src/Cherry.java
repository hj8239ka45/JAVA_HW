//�l
public class Cherry extends Fruit{  	//�~�Ӫ��l���O������@ abstract ��k
	Cherry(double price,int quantity){
		super(price,quantity);
		
	}
	public double calc() {
		double tax= 0.1;
		return getprice()*getquantity()*(1+tax);
	}
}
