//¤l
public class Deposit extends Transaction{
	private Account a;
	Deposit(Account a){
		this.a=a;
	}
	public void setBalance(int cash) {
		a.setBalance(cash);
	}
	
}
