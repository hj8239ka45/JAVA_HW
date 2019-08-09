import javax.swing.JOptionPane;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int continu =3;
		String pass="";
		String name,hwAmount,averageScore;
		name = JOptionPane.showInputDialog(null, "What's student's name?");
		HWScore hw=new HWScore();
		hw.setName(name);
		
		hwAmount = JOptionPane.showInputDialog(null, "Please enter the amount of HW.");
		int i_hwAmount=Integer.valueOf(hwAmount);
		hw.setnum(i_hwAmount);
		
		averageScore = JOptionPane.showInputDialog(null, "Please enter the average of HW.");
		
		int i_averageScore=Integer.valueOf(averageScore);
		while(i_averageScore>100||i_averageScore<0) {
			averageScore=JOptionPane.showInputDialog(null, "Wrong score range,please enter 1~100");
			i_averageScore=Integer.valueOf(averageScore);
		}
		hw.setave(i_averageScore);
		do {
			String Yes = JOptionPane.showInputDialog(null, "1.show 2.input");
			if(Yes.equals("1")) {
				pass="Pass";
				if(hw.getave()<60) {pass="No Pass";}
				String talk="Name:"+hw.getname()+"\nAmount:"+hw.getnum()+"\nAverage Scare:"+hw.getave()+"\n"+pass;
				JOptionPane.showMessageDialog(null, talk);
				continu =JOptionPane.showConfirmDialog(null, "Do you want to continue?");
			}
			if(Yes.equals("2")) {
				String newscore = JOptionPane.showInputDialog(null, "Please enter a score of HW.");
				int i_newscore=Integer.valueOf(newscore);
				while(i_newscore>100||i_newscore<0) {
					newscore=JOptionPane.showInputDialog(null, "Wrong score range,please enter 1~100");
					i_newscore=Integer.valueOf(newscore);
					}
				hw.setave((hw.getave()*hw.getnum()+i_newscore)/(i_hwAmount+1));
				hw.setnum(i_hwAmount+1);
				if(hw.getave()<60) {pass="No Pass";}
				String talk="Name:"+hw.getname()+"\nAmount:"+hw.getnum()+"\nAverage Scare:"+hw.getave()+"\n"+pass;
				 JOptionPane.showMessageDialog(null, talk);
				continu =JOptionPane.showConfirmDialog(null, "Do you want to continue?");
			}
		}while(continu==0);
			if(hw.getave()<60) {pass="No Pass";}
			String talk="Name:"+hw.getname()+"\nAmount:"+hw.getnum()+"\nAverage Scare:"+hw.getave()+"\n"+pass;
			 JOptionPane.showMessageDialog(null, talk);
		
	}

}