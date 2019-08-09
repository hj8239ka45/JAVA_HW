
public class Happy extends Player{
	private int no;
	Happy(String pN){
		super(pN);
		this.no=1;
	}
	public boolean buyStrategy() {
		return true;
	}
	public int getcheck() {
		return this.no;
	}
}
