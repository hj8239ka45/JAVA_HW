import java.util.Random;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Random random = new Random();

									////	產生中獎亂數		////
		int t=0;
		int num_win[]=new int[20];											//中獎序號亂數
		int num_win_ch[]=new int[5];										//中獎序號矩陣簡易化
		int num_computer[]=new int[20];										//電腦選號亂數
		int num[]=new int[5];												//等待對獎序號矩陣
		
		for(int i=0;i<num_win.length;i++) {									//歸零
			num_win[i]=0;
		}
		for(int i=0;i<5;i++) {												//判斷是否數字重複
			int aa=0;
			boolean bool=true;
			do {
				aa=random.nextInt(20);
				if(num_win[aa]==0) {
					num_win[aa]=aa+1;
					bool=false;
				}
				else bool=true;
			}while(bool);
			//System.out.printf("中獎數字%3d在第%3d矩正裡\n",num_win[aa],aa);//驗算用
			num_win_ch[i]=num_win[aa];
		}
		
		
									////	中獎亂數結束		////
		
		int test=0;
		do {
			System.out.println("自選號碼請輸入1\t電腦選號請輸入2:");
			test=scan.nextInt();
		}while(!(test==1||test==2));
		String str=scan.nextLine();
		
											//自己選號start
		if(test==1){
			do {
				t=0;														//初始沒偵測到錯誤
				System.out.println("請輸入五個大樂透號碼並且以空格隔開:");
				str=scan.nextLine();
				String a[]=str.split(" ");
				
									////	錯誤感應開始		////				
				if(a.length!=5) {											////數量錯誤:
					System.out.println("輸入大樂透號碼數量不對!!!");
					t=1;													//偵測到錯誤
				}
				if(t==0){
					for(int b=0;b<a.length;b++) {
						num[b]=Integer.parseInt(a[b]);
						//System.out.println(num[b]);  //檢驗
						for(int doub=0;doub<b;doub++) {						////重複錯誤:
							if(num[b]==num[doub]) {
								System.out.println("重複數字請重新輸入!!!");
								t=1;										//偵測到錯誤
								break;
							}
						}
						if(t==1)break;
					}
				}
				if(t==0)
					for(int b=0;b<a.length;b++) {
						if(num[b]<0||num[b]>20) {							////範圍錯誤:
							System.out.println("超出範圍請重新輸入!!!");
							t=1;											//偵測到錯誤
							break;
						}
					}
									////	錯誤感應結束		////
			}while(t!=0);													//檢測是否有錯誤
		}
											//自己選號end
											//電腦選號start
		if(test==2){
			for(int i=0;i<num_computer.length;i++) {						//歸零
				num_computer[i]=0;
			}
			for(int i=0;i<5;i++) {											//判斷是否數字重複
				int aa=0;
				boolean bool=true;
				do {
					aa=random.nextInt(20);
					if(num_computer[aa]==0) {
						num_computer[aa]=aa+1;
						bool=false;
					}
					else bool=true;
				}while(bool);
				num[i]=num_computer[aa];
			}
		}
											//電腦選號end

		System.out.printf("您的號碼為 : ");
		for(int i=0;i<5;i++) {												//顯示自己的號碼
			System.out.printf("%4d",num[i]);
		}
		System.out.println();
		int strick_num=0;													//中的號碼數
		System.out.printf("開獎的數字為 : ");
		
		for(int i=0;i<5;i++) {												//顯示開獎號碼
			System.out.printf("%4d",num_win_ch[i]);
			for(int k=0;k<5;k++) {
				if(num[i]==num_win_ch[k]) {
					strick_num++;
				}
			}
		}
		System.out.println();
		//System.out.println(strick_num);									//中的號碼數
		
		switch(strick_num) {
		case 0:
			
		case 1:
			
		case 2:
			System.out.println("謝謝再連絡@_@");
			break;
		case 3:
			
		case 4:
			
		case 5:
			System.out.println("恭喜你中獎");
			break;
		}
		
		
	}
}
