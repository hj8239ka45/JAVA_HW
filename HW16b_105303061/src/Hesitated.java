
public class Hesitated extends Player{
	private int no;
	Hesitated(String pN){
		super(pN);
		this.no=0;
		
	}
	public boolean buyStrategy() {
		int rate = (int) (Math.random()*2);
		if(rate==1)
			return false;
		else
			return true;
	}
	public int getcheck() {
		return this.no;
	}
}