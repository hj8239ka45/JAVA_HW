import java.util.Scanner;

public class statucs {
	
	static void checkPrime(int x) {
		
		int a=x;
		while(a>1) {
			x=a;
			for(int y=1;y<(a/2);y++) {
				if(x%y==0) {
					x/=y;
				}
			}
			if(x==a) {
				if(x==2)System.out.printf("%d",x);
				else System.out.printf("%d,",x);
			}
		a--;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		Scanner scan=new Scanner(System.in);
		
		System.out.printf("請輸入一個正整數:");
		a=scan.nextInt();	
		System.out.printf("%d\n",a);
			
		checkPrime(a);
	}
}
