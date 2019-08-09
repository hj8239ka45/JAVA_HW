//陳崴淇 105303061 機械2B
//while_loop
//class命名不小心寫錯了
import java.util.Scanner;

import javax.swing.JOptionPane;
public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp,num;
		int times=0;
		int totaldust,usedust;
		temp = JOptionPane.showInputDialog(null,"How many stardust do you have?");
		num = JOptionPane.showInputDialog(null,"How many stardust will consume when you powerup this pokemon?");
		totaldust = Integer.parseInt(temp);
		usedust=Integer.parseInt(num);
		while(totaldust -usedust>0) {
			totaldust =totaldust -usedust;
			String message = "You still have "+totaldust+" stardust.";
			JOptionPane.showMessageDialog(null,message);
			times+=1;
		}
		String message2 ="You can powerup this pokemon "+times+" times.";
		JOptionPane.showMessageDialog(null,message2);
	}

}
