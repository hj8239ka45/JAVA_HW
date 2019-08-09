//陳崴淇 105303061機械2B
import java.util.Scanner;
import javax.swing.JOptionPane;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int temp = (int) (Math.random()*100)+1;
		int min=1,max=100;
		
		//System.out.printf("正確答案是%d",temp);		//測試程式時請使用
		
		System.out.printf("請輸入%d~%d的整數:",min,max);
		int a = scan.nextInt();
		while(a!=temp) {
			if(min<a&&a<temp) {
				min=a;
				System.out.printf("請輸入%d~%d的整數:",min,max);
			}
			else if(max>a&&a>temp) {
				max=a;
				System.out.printf("請輸入%d~%d的整數:",min,max);
			}
			else {
				System.out.printf("超出範圍，請重新輸入");
			}
			
			a = scan.nextInt();
		}
		System.out.printf("恭喜你答對了，正確答案是%d",temp);
	}
}
