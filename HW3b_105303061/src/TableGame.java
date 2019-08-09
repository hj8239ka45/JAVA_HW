
public class TableGame {
	private String name;
	private int price,overdue;
	
	public TableGame(int initprice,int initoverdue) {
	this.price=initprice;
	this.overdue=initoverdue;
	}
	
	public void setName(String n) {
		this.name= n;
	}
	public void setPrice(int d) {
		this.price= d;
	}
	public void setOverdue(int t) {
		this.overdue= t;
	}
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public int getOverdue() {
		return this.overdue;
	}
}
