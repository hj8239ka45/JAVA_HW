import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		
		String [][] shirtArr= {
				{"編號","品牌","種類","售價" },
				{"1","HANGTEN","襯衫","590" },
				{"2","NET","長袖","1290" },
				{"3","GIORDANO","短袖","3000" },
				{"4","UNIQLO","襯衫","5590" }
		};
		String [][] jeansArr= {
				{"編號","品牌","種類","售價" },
				{"1","BOBSON","長褲","1890" },
				{"2","BOSS","短褲","3690" },
				{"3","EDWIN","低腰褲","4590" },
				{"4","LEVI'S","牛仔褲","6690" }
		};
		String [][] shoesArr= {
				{"編號","品牌","種類","售價" },
				{"1","CONVERSE","帆布鞋","2000" },
				{"2","ADIDAS","休閒鞋","2590" },
				{"3","VANS","板鞋","3000" },
				{"4","NIKE","球鞋","3590" }
		};
		String [][] bagArr= {
				{"編號","品牌","種類","售價" },
				{"1","AIRWALK","後背包","1390" },
				{"2","JANSPORT","學生包","2290" },
				{"3","EASTPARK","登山包","3890" },
				{"4","OUTDOOR","側背包","4690" }
		};
		
		Invoice[] inv = new Invoice[4];									//class型別變數之Array宣告
		
		
		
		//A     shirt
		ArrayList<ArrayList<String>> aList = new ArrayList<ArrayList<String>>();//2次矩正的ArrayList宣告法
		for(int j=0; j<5; j++) {												//2次ArrayList的層數累計方式
			ArrayList<String> aListData = new ArrayList<String>();				//2次矩正的ArrayList表示法
			aListData.add(shirtArr[j][0]);										// add data 
			aListData.add(shirtArr[j][1]);
			aListData.add(shirtArr[j][2]);
			aListData.add(shirtArr[j][3]);										// .....End
			aList.add(aListData);												//1次ArrayList轉2次ArrayList
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				System.out.printf("%-10s\t",aList.get(i).get(j));						//2次矩正的ArrayList讀取法
			}															//i為層數j為此層第幾個放入數
			System.out.println();
		}
		System.out.print("請輸入想要購買的編號:");
		int a1=scan.nextInt();
		System.out.print("請輸入想要購買的數量:");
		int a2=scan.nextInt();
		
		
			//String brand,String description,int quantity,double price
		int temp[]=new int[4];
		char ch[]=new char[4];
		for(int t=0;t<4;t++) {
			ch[t]=shirtArr[a1][3].charAt(t);//
			temp[t]=ch[t]-48;
			//System.out.println(temp[t]);
		}
		double price[]=new double[4];
		price[0]=temp[0]*1000+temp[1]*100+temp[2]*10+temp[3];
		inv[0]=new Invoice(shirtArr[a1][1],shirtArr[a1][2],a2,price[0]);
		
		
		
		//B				jeans
		ArrayList<ArrayList<String>> bList = new ArrayList<ArrayList<String>>();
		for(int j=0; j<5; j++) {												//2次ArrayList的層數累計方式
			ArrayList<String> bListData = new ArrayList<String>();				//2次矩正的ArrayList表示法
			bListData.add(jeansArr[j][0]);										// add data 
			bListData.add(jeansArr[j][1]);
			bListData.add(jeansArr[j][2]);
			bListData.add(jeansArr[j][3]);										// .....End
			bList.add(bListData);												//1次ArrayList轉2次ArrayList
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				System.out.printf("%-10s\t",bList.get(i).get(j));						//2次矩正的ArrayList讀取法
			}																	//i為層數j為此層第幾個放入數
			System.out.println();
		}
		System.out.print("請輸入想要購買的編號:");
		int b1=scan.nextInt();
		System.out.print("請輸入想要購買的數量:");
		int b2=scan.nextInt();
		//checkcheckcheckcheckcheckcheckcheckcheckcheck
		for(int t=0;t<4;t++) {
			ch[t]=jeansArr[b1][3].charAt(t);
			temp[t]=ch[t]-48;
			//System.out.println(temp[t]);
		}
		price[1]=temp[0]*1000+temp[1]*100+temp[2]*10+temp[3];
		inv[1]=new Invoice(jeansArr[b1][1],jeansArr[b1][2],b2,price[1]);
		
		//C				shoes
		ArrayList<ArrayList<String>> cList = new ArrayList<ArrayList<String>>();
		for(int j=0; j<5; j++) {												//2次ArrayList的層數累計方式
			ArrayList<String> cListData = new ArrayList<String>();				//2次矩正的ArrayList表示法
			cListData.add(shoesArr[j][0]);										// add data 
			cListData.add(shoesArr[j][1]);
			cListData.add(shoesArr[j][2]);
			cListData.add(shoesArr[j][3]);										// .....End
			cList.add(cListData);												//1次ArrayList轉2次ArrayList
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				System.out.printf("%-10s\t",cList.get(i).get(j));					//2次矩正的ArrayList讀取法
			}																	//i為層數j為此層第幾個放入數
			System.out.println();
		}
		System.out.print("請輸入想要購買的編號:");
		int c1=scan.nextInt();
		System.out.print("請輸入想要購買的數量:");
		int c2=scan.nextInt();
		//checkcheckcheckcheckcheckcheckcheckcheckcheck
		for(int t=0;t<4;t++) {
			ch[t]=shoesArr[c1][3].charAt(t);
			temp[t]=ch[t]-48;
			//System.out.println(temp[t]);
		}
		price[2]=temp[0]*1000+temp[1]*100+temp[2]*10+temp[3];
		inv[2]=new Invoice(shoesArr[c1][1],shoesArr[c1][2],c2,price[2]);
		
		//D				bag
		ArrayList<ArrayList<String>> dList = new ArrayList<ArrayList<String>>();
		for(int j=0; j<5; j++) {												//2次ArrayList的層數累計方式
			ArrayList<String> dListData = new ArrayList<String>();				//2次矩正的ArrayList表示法
			dListData.add(bagArr[j][0]);										// add data 
			dListData.add(bagArr[j][1]);
			dListData.add(bagArr[j][2]);
			dListData.add(bagArr[j][3]);										// .....End
			dList.add(dListData);												//1次ArrayList轉2次ArrayList
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				System.out.printf("%-10s\t",dList.get(i).get(j));						//2次矩正的ArrayList讀取法
			}																	//i為層數j為此層第幾個放入數
			System.out.println();
		}
		System.out.print("請輸入想要購買的編號:");
		int d1=scan.nextInt();
		System.out.print("請輸入想要購買的數量:");
		int d2=scan.nextInt();
		//checkcheckcheckcheckcheckcheckcheckcheckcheck
		for(int t=0;t<4;t++) {
			ch[t]=bagArr[d1][3].charAt(t);
			temp[t]=ch[t]-48;
			//System.out.println(temp[t]);
		}
		price[3]=temp[0]*1000+temp[1]*100+temp[2]*10+temp[3];
		inv[3]=new Invoice(bagArr[d1][1],bagArr[d1][2],d2,price[3]);
		
		System.out.println("==========採購清單==========");
		System.out.printf("%-10s\t%-10s\t%-10s\t%-10s\t\n","產品名稱","產品種類","購買數量","物品售價");
		double total=0;
		for(int i=0;i<4;i++) {
			System.out.printf("%-10s\t%-10s\t%-10s\t%-10s\t\n",inv[i].getBrand(),inv[i].getDescription(),inv[i].getQuantity(),inv[i].getPrice());
			//System.out.println(inv[i].getBrand()+"\t"+inv[i].getDescription()+"\t"+inv[i].getQuantity()+"\t"+inv[i].getPrice());
			total =total+inv[i].getPrice()*inv[i].getQuantity();
		}
		System.out.println("總金額 : "+total);
		System.out.println("==========感謝您的購買==========");
	}

}
