import javax.swing.JOptionPane;

public class fuction {
	public static int num (int s1,int s2,int a) {
		int s=(s2-s1*10);
		System.out.printf("%d\t",s1);
		System.out.println(s2);
		return s*a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b,c,c1,total,fin;
		c1=0;
		do {
		String E= JOptionPane.showInputDialog(null,"請輸入身分證開頭的英文對應數字:\nA=10~Z=33:");
		b=Integer.parseInt(E);
		}while(b>35||b<10);
		b=b/10+(b%10)*9;
		do {
		String e= JOptionPane.showInputDialog(null,"英文後8位數:");
		c=Integer.parseInt(e);//87654321
		}while(c<= Math.pow(10,7)||c>= Math.pow(10,8))		;//E14	12510074	8
		System.out.printf("%d\t",c);
		for(int a=8;a>0;a--) {
			
			c1=c1+num((int) (c/Math.pow(10,a)),(int) (c/Math.pow(10,a-1)),a);
		}
		
		c=c1;
		System.out.println(c);
		total=c+b;
		fin = 10-total%10;
		String Fin=String.valueOf(fin);
		JOptionPane.showMessageDialog(null, fin);
	}

}