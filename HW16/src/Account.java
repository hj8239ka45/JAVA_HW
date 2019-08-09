//class
public class Account {
	private int balance;
	private String name;
	private String AccNo;
	
	Account(int cash,String n,String acc){
		setBalance(cash);
		this.name=n;
		this.AccNo=acc;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public String getAccNo() {
		return this.AccNo;
	}
	
	public void setBalance(int cash) {
		balance=balance+cash;
	}
}
