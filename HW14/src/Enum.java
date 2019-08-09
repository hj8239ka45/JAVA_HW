import java.util.Scanner;

public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.
		for(mode mo:mode.values())
			System.out.println(mo);
		// 2.
		for(mode mo:mode.values())
			System.out.println(mo.toString());
		//比較1. 2.
		
		System.out.println("請輸入拍照模式");
		Scanner scan=new Scanner(System.in);
		int num =scan.nextInt();
				//設定mode2 為enum的資料.接收法
		mode mode2=mode.Smile;
				//改變接收值
		System.out.println("您選擇的是: "+mode2.chosingmode(num));
		
		
		for(mode mode1:mode.values())
			if(mode1.getnum()==num)
				System.out.println("您選擇的是: "+mode1.toString2());
		
	}
}
