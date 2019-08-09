//main
import javax.swing.JOptionPane;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account(1000,"John","8923345");
		Transaction t=null;
		int r1,r2;
		do {
			r1=Integer.parseInt(JOptionPane.showInputDialog("請輸入交易型態:(1) deposit, (2) withdraw"));
			switch(r1) {
			case 1:
				t=new Deposit(a);
				break;
			case 2:
				t=new Withdraw(a);
				break;
			}
			r2=Integer.parseInt(JOptionPane.showInputDialog("請輸入交易金額: "));
			t.setBalance(r2);
		}	while(JOptionPane.showConfirmDialog(null,"Another transaction?")==0);
		
		JOptionPane.showMessageDialog(null, "Dear "+a.getName()+" 您目前的餘額: "+a.getBalance()+"\nNumber of transaction objects created:"+t.getCount());
		
	}

}
