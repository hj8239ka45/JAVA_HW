import java.util.Scanner;

import javax.swing.JOptionPane;

public class advanced_control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distance,delay,price_delay=0,price_distance=70,dr=500;
		String yes_no;
		Scanner scan=new Scanner(System.in);
		System.out.print("�п�J�p�{�����{��:");
		distance=scan.nextInt();
		
		System.out.print("�O�_������(yes/no):");
		yes_no=scan.nextLine();
		yes_no=scan.nextLine();
		distance=distance-1500;
			while(distance> 0) {
				distance=distance - dr;
				dr=dr+50;
				price_distance=price_distance+5;
				/*System.out.printf("%d��",price_distance);
				System.out.printf("%d�Z��",distance);*/
			}

		if(yes_no.equals("yes")) {
		System.out.print("�п�J����ɶ���������:");
		delay=scan.nextInt();
		price_delay=(delay/3)*5;
		System.out.printf("���{��%d��\n",price_distance);
		System.out.printf("����ɶ���%d��\n",price_delay);
		}
		
		System.out.printf("�`�@��%d��",price_delay+price_distance);
		
	}
}
