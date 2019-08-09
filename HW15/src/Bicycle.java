
public class Bicycle {
	private Wheel w;
	private Frame f;
	private static int quantity;
	private double cost;
	Bicycle(Frame f,Wheel w){
		this.f=f;
		this.w=w;
		quantity++;
		setcost();
	}
	public void changeWheel(Wheel w) {
		this.w=w;
		setcost();
	}
	public void changeFrame(Frame f) {
		this.f=f;
		setcost();
	}
	public void setcost() {
		this.cost=this.f.getcost()+this.w.getcost();
	}
	public double getcost() {
		return this.cost+500;
	}
	public static int getQuantity() {
		
		//System.out.print(num);
		return quantity;
	}
}
