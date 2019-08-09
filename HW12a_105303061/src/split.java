//105303061
import java.util.Scanner;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("請依序輸入數字(以空白隔開):");
		String str=scan.nextLine();
		String a[]=str.split(" ");			//split the string into an array
		System.out.print("排序後的結果為:");
		int num[] =new int[a.length];
		for(int b=0;b<a.length;b++) {		//use to change
			num[b]=Integer.parseInt(a[b]);	//change the type of information
			for(int c=0;c<b;c++) {			//start to change
				if(num[b]>num[c]) {
					int temp=num[b];
					num[b]=num[c];
					num[c]=temp;
				}
			}
		}
		for(int b=0;b<a.length;b++) 		//display the end
		System.out.printf("%5d",num[b]);
		
	}

}
