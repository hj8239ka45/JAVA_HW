import java.util.Scanner;

public class statics {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scan =new Scanner(System.in);
		System.out.print("�п�J�T�ӼƦr(�H�Ů�j�})");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		num.Num(a,b,c);
		
		
		System.out.printf("�̤j�Ȭ�:%d\n",num.getmaxnum());
		System.out.printf("�̤p�Ȭ�:%d\n",num.getminnum());
		
		System.out.printf("�̤j�ȻP�̤p�Ȫ����n��:%d\n",num.getcross());
	}

}
