
public class Land {
	private int price;
	String place;
	Player owner=null;
	String name;
	Land(String place,int price){
		this.price=price;
		this.place=place;
	}
	public int getprice() {
		return price;
	}
	public String getplace() {
		return this.place;
	}
	public void setOwner(Player p) {
		p.setmoney(getprice());
		owner = p;
		name=String.valueOf(p.getname());
	}
}
