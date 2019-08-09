import java.util.Scanner;

import javax.swing.JOptionPane;

public class advanced_control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distance,delay,price_delay=0,price_distance=70,dr=500;
		String yes_no;
		Scanner scan=new Scanner(System.in);
		System.out.print("請輸入計程車里程數:");
		distance=scan.nextInt();
		
		System.out.print("是否有延遲(yes/no):");
		yes_no=scan.nextLine();
		yes_no=scan.nextLine();
		distance=distance-1500;
			while(distance> 0) {
				distance=distance - dr;
				dr=dr+50;
				price_distance=price_distance+5;
				/*System.out.printf("%d元",price_distance);
				System.out.printf("%d距離",distance);*/
			}

		if(yes_no.equals("yes")) {
		System.out.print("請輸入延遲時間的分鐘數:");
		delay=scan.nextInt();
		price_delay=(delay/3)*5;
		System.out.printf("里程為%d元\n",price_distance);
		System.out.printf("延遲時間為%d元\n",price_delay);
		}
		
		System.out.printf("總共為%d元",price_delay+price_distance);
		
	}
}
