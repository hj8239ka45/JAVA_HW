import javax.swing.JOptionPane;

//¤l
public class Withdraw extends Transaction{
	private Account a;
	Withdraw(Account a){
		this.a=a;
		
	}
	public void setBalance(int cash) {
		if(a.getBalance()-cash>=0)
		a.setBalance(-1*cash);
		else{
			JOptionPane.showMessageDialog(null, "You have no money to do this.");
			super.getCount(-1);
		}
	}
}
