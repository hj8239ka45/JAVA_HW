
public abstract class Player {
	private String name;
	private int money=2000;
	int location=0;
	int random;
	Player(String pN){
		this.name=pN;
		this.money=money;
	}
	public String getname() {
		return this.name;
	}
	public void move() {
		random=(int) (Math.random()*6)+1;
		location+=random;
		if(location>39)
		{
			location-=39;
		}
		this.location=location;
	}
	public void payPrice(Land place) {
		this.money=this.money -place.getprice()/2;
	}
	public void getPrice(Land place) {
		this.money=this.money +place.getprice()/2;
	}
	public abstract boolean buyStrategy();
	public abstract int getcheck();
	//
	public void setmoney(int price) {
		this.money=this.money-price;
	}
	public int getmoney() {
		return this.money;
	}
}
