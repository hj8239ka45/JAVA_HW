//�l
public class Orange extends Fruit{  	//�~�Ӫ��l���O������@ abstract ��k
	Orange(double price,int quantity){
		super(price,quantity);
		
	}
	public double calc() {
		return getprice()*getquantity();
	}
}
