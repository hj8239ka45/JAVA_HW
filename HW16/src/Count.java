//main
import javax.swing.JOptionPane;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account(1000,"John","8923345");
		Transaction t=null;
		int r1,r2;
		do {
			r1=Integer.parseInt(JOptionPane.showInputDialog("�п�J������A:(1) deposit, (2) withdraw"));
			switch(r1) {
			case 1:
				t=new Deposit(a);
				break;
			case 2:
				t=new Withdraw(a);
				break;
			}
			r2=Integer.parseInt(JOptionPane.showInputDialog("�п�J������B: "));
			t.setBalance(r2);
		}	while(JOptionPane.showConfirmDialog(null,"Another transaction?")==0);
		
		JOptionPane.showMessageDialog(null, "Dear "+a.getName()+" �z�ثe���l�B: "+a.getBalance()+"\nNumber of transaction objects created:"+t.getCount());
		
	}

}
