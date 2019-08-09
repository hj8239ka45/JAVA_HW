//¤÷
public abstract class Transaction {
	private static int count=0;
	public Transaction(){
		count++;
	}
	public int getCount() {
		return count;
	}
	public int getCount(int a) {
		count=count-1;
		return count;
	}
	public abstract void setBalance(int cash);
	
}
