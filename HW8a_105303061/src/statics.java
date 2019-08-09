import java.util.Scanner;

public class statics {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scan =new Scanner(System.in);
		System.out.print("叫块计(筳秨)");
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		
		num.Num(a,b,c);
		
		
		System.out.printf("程:%d\n",num.getmaxnum());
		System.out.printf("程:%d\n",num.getminnum());
		
		System.out.printf("程籔程縩:%d\n",num.getcross());
	}

}
