import java.util.Scanner;

public class forloop {
	
	static boolean isPrime(int x) {
		
		int a=x;
			for(int y=2;y<(a/2);y++) {
					if(x%y==0) {
						return false;
					}
			}
			
		return true;
	}
	
	static int minFactor(int i) {
		boolean a=isPrime(i);
		while(a==false) {
			int test = i;
			
			for(int b=2;b<i;b++) {
				if(i%b==0) {
					i=i/b;
				}
				a=isPrime(i);
			}
		}
		if(a==true) {
			//System.out.print(a);
				return i;
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入一個正整數:");
		Scanner scan=new Scanner(System.in);
		
		int a=scan.nextInt();
		System.out.printf("%d=",a);
		int c=a;
		for(int z=0;z<c/2;z++) {
			c=minFactor(a);
			System.out.printf("%d*",c);
			a=a/c;
			//System.out.printf("\t%d\t",a);/////
		}//System.out.printf("%d",a);
	}

}
