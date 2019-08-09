
public class Stingy extends Player{
	private int no;
	Stingy(String pN){
		super(pN);
		this.no=2;
	}
	public boolean buyStrategy() {
			return false;
	}
	public int getcheck() {
		return this.no;
	}
}
