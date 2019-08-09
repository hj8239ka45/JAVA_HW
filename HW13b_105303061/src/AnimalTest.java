import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] animalKeep = new Animal[2];									//class型別變數之Array宣告
		Scanner scan =new Scanner(System.in);
		for(int i=0;i<2;i++){													//class型別變數之Array初始設定
			animalKeep[i] = new Animal();
	      }
		Date dog_time=new Date(1,20,2017);
		Date cat_time=new Date(6,18,2017);
		
		ArrayList<ArrayList<String>> aList = new ArrayList<ArrayList<String>>();//2次矩正的ArrayList宣告法
		ArrayList<ArrayList<String>> bList = new ArrayList<ArrayList<String>>();
		String[][] dogArr = { {"編號","名字","性別","年齡"},
								 {"1","蛋白","公狗","3歲"},
								 {"2","Angela","母狗","1歲"},
								 {"3","雞腿","公狗","5歲"},
								 {"4","點點","公狗","2歲"}
							};
		
		String[][] catArr = {{"編號","名字","性別","年齡"}, 
								{"1","巧虎","公貓","2歲"},
								{"2","喵嗚","公貓","1歲"},
								{"3","花花","母貓","3歲"},
								{"4","波妞","母貓","6歲"}
							};
		
		System.out.println("========歡迎收養流浪貓狗========");
		for(int j=0; j<5; j++) {												//2次ArrayList的層數累計方式
			ArrayList<String> aListData = new ArrayList<String>();				//2次矩正的ArrayList表示法
			aListData.add(dogArr[j][0]);										// add data 
			aListData.add(dogArr[j][1]);
			aListData.add(dogArr[j][2]);
			aListData.add(dogArr[j][3]);										// .....End
			aList.add(aListData);												//1次ArrayList轉2次ArrayList
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(aList.get(i).get(j)+"\t");						//2次矩正的ArrayList讀取法
			}																	//i為層數j為此層第幾個放入數
			System.out.println();
		}
		System.out.print("請輸入想要認養的編號:");
		int a=scan.nextInt();
		for(int j=0; j<5; j++) {
			ArrayList<String> aListData = new ArrayList<String>();
			// add data 
			aListData.add(catArr[j][0]);
			aListData.add(catArr[j][1]);
			aListData.add(catArr[j][2]);
			aListData.add(catArr[j][3]);
			bList.add(aListData);
			// .....
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(bList.get(i).get(j)+"\t");
			}
			System.out.println();
		}
		////////
		System.out.print("請輸入想要認養的編號:");
		int b=scan.nextInt();
		animalKeep[0].setAnimal(dogArr[a][1],dogArr[a][2],dogArr[a][3],dog_time);//放入條件
		animalKeep[1].setAnimal(catArr[b][1],catArr[b][2],catArr[b][3],cat_time);
		System.out.print("========認養清單========\n");
		System.out.printf("%s\t%s\t%s\t%s",dogArr[0][1],dogArr[0][2],dogArr[0][3],"入園時間\n");
		display(animalKeep[0]);													//顯示
		display(animalKeep[1]);
		System.out.print("======感謝您的認養======\n");
		
	}
	private static void display(Animal ani) {									//讀取每個class裡的toString()
		System.out.printf("%s",ani.toString());
	}
}
