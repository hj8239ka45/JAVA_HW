import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		do {
			System.out.print("½Ð¿é¤J7­Ó¦r¥À:");
			Scanner scan=new Scanner(System.in);
			a=scan.nextLine();
		}while(a.length()!=7);
		char ch[]=new char[7];
		int temp[]=new int[7];
		int total = 0;
		String total2 ="";
		for(int t=0;t<7;t++) {
			ch[t]=a.charAt(t);
			temp[t]=ch[t];
			if(t>0) {
				total=Math.abs(temp[t]-temp[t-1]);
				total2=total2+String.valueOf(total);
				
			}
			//if(t>0) System.out.printf("%d",Math.abs(temp[t]-temp[t-1]));
		}
		//System.out.printf("%s",total2);
		for(int t=0;t<6;t++) {
			System.out.printf("%c",total2.charAt(t));
			}
		
	}
}
