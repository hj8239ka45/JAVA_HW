//���Q�N 105303061����2B
import java.util.Scanner;
import javax.swing.JOptionPane;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int temp = (int) (Math.random()*100)+1;
		int min=1,max=100;
		
		//System.out.printf("���T���׬O%d",temp);		//���յ{���ɽШϥ�
		
		System.out.printf("�п�J%d~%d�����:",min,max);
		int a = scan.nextInt();
		while(a!=temp) {
			if(min<a&&a<temp) {
				min=a;
				System.out.printf("�п�J%d~%d�����:",min,max);
			}
			else if(max>a&&a>temp) {
				max=a;
				System.out.printf("�п�J%d~%d�����:",min,max);
			}
			else {
				System.out.printf("�W�X�d��A�Э��s��J");
			}
			
			a = scan.nextInt();
		}
		System.out.printf("���ߧA����F�A���T���׬O%d",temp);
	}
}
