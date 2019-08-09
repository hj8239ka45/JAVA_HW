import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		
		
		String [][] shirtArr= {
				{"�s��","�~�P","����","���" },
				{"1","HANGTEN","Ũ�m","590" },
				{"2","NET","���S","1290" },
				{"3","GIORDANO","�u�S","3000" },
				{"4","UNIQLO","Ũ�m","5590" }
		};
		String [][] jeansArr= {
				{"�s��","�~�P","����","���" },
				{"1","BOBSON","����","1890" },
				{"2","BOSS","�u��","3690" },
				{"3","EDWIN","�C�y��","4590" },
				{"4","LEVI'S","���J��","6690" }
		};
		String [][] shoesArr= {
				{"�s��","�~�P","����","���" },
				{"1","CONVERSE","�|���c","2000" },
				{"2","ADIDAS","�𶢾c","2590" },
				{"3","VANS","�O�c","3000" },
				{"4","NIKE","�y�c","3590" }
		};
		String [][] bagArr= {
				{"�s��","�~�P","����","���" },
				{"1","AIRWALK","��I�]","1390" },
				{"2","JANSPORT","�ǥͥ]","2290" },
				{"3","EASTPARK","�n�s�]","3890" },
				{"4","OUTDOOR","���I�]","4690" }
		};
		
		Invoice[] inv = new Invoice[4];									//class���O�ܼƤ�Array�ŧi
		
		
		
		//A     shirt
		ArrayList<ArrayList<String>> aList = new ArrayList<ArrayList<String>>();//2���x����ArrayList�ŧi�k
		for(int j=0; j<5; j++) {												//2��ArrayList���h�Ʋ֭p�覡
			ArrayList<String> aListData = new ArrayList<String>();				//2���x����ArrayList��ܪk
			aListData.add(shirtArr[j][0]);										// add data 
			aListData.add(shirtArr[j][1]);
			aListData.add(shirtArr[j][2]);
			aListData.add(shirtArr[j][3]);										// .....End
			aList.add(aListData);												//1��ArrayList��2��ArrayList
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				System.out.printf("%-10s\t",aList.get(i).get(j));						//2���x����ArrayListŪ���k
			}															//i���h��j�����h�ĴX�ө�J��
			System.out.println();
		}
		System.out.print("�п�J�Q�n�ʶR���s��:");
		int a1=scan.nextInt();
		System.out.print("�п�J�Q�n�ʶR���ƶq:");
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
		for(int j=0; j<5; j++) {												//2��ArrayList���h�Ʋ֭p�覡
			ArrayList<String> bListData = new ArrayList<String>();				//2���x����ArrayList��ܪk
			bListData.add(jeansArr[j][0]);										// add data 
			bListData.add(jeansArr[j][1]);
			bListData.add(jeansArr[j][2]);
			bListData.add(jeansArr[j][3]);										// .....End
			bList.add(bListData);												//1��ArrayList��2��ArrayList
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				System.out.printf("%-10s\t",bList.get(i).get(j));						//2���x����ArrayListŪ���k
			}																	//i���h��j�����h�ĴX�ө�J��
			System.out.println();
		}
		System.out.print("�п�J�Q�n�ʶR���s��:");
		int b1=scan.nextInt();
		System.out.print("�п�J�Q�n�ʶR���ƶq:");
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
		for(int j=0; j<5; j++) {												//2��ArrayList���h�Ʋ֭p�覡
			ArrayList<String> cListData = new ArrayList<String>();				//2���x����ArrayList��ܪk
			cListData.add(shoesArr[j][0]);										// add data 
			cListData.add(shoesArr[j][1]);
			cListData.add(shoesArr[j][2]);
			cListData.add(shoesArr[j][3]);										// .....End
			cList.add(cListData);												//1��ArrayList��2��ArrayList
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				System.out.printf("%-10s\t",cList.get(i).get(j));					//2���x����ArrayListŪ���k
			}																	//i���h��j�����h�ĴX�ө�J��
			System.out.println();
		}
		System.out.print("�п�J�Q�n�ʶR���s��:");
		int c1=scan.nextInt();
		System.out.print("�п�J�Q�n�ʶR���ƶq:");
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
		for(int j=0; j<5; j++) {												//2��ArrayList���h�Ʋ֭p�覡
			ArrayList<String> dListData = new ArrayList<String>();				//2���x����ArrayList��ܪk
			dListData.add(bagArr[j][0]);										// add data 
			dListData.add(bagArr[j][1]);
			dListData.add(bagArr[j][2]);
			dListData.add(bagArr[j][3]);										// .....End
			dList.add(dListData);												//1��ArrayList��2��ArrayList
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<4;j++) {
				System.out.printf("%-10s\t",dList.get(i).get(j));						//2���x����ArrayListŪ���k
			}																	//i���h��j�����h�ĴX�ө�J��
			System.out.println();
		}
		System.out.print("�п�J�Q�n�ʶR���s��:");
		int d1=scan.nextInt();
		System.out.print("�п�J�Q�n�ʶR���ƶq:");
		int d2=scan.nextInt();
		//checkcheckcheckcheckcheckcheckcheckcheckcheck
		for(int t=0;t<4;t++) {
			ch[t]=bagArr[d1][3].charAt(t);
			temp[t]=ch[t]-48;
			//System.out.println(temp[t]);
		}
		price[3]=temp[0]*1000+temp[1]*100+temp[2]*10+temp[3];
		inv[3]=new Invoice(bagArr[d1][1],bagArr[d1][2],d2,price[3]);
		
		System.out.println("==========���ʲM��==========");
		System.out.printf("%-10s\t%-10s\t%-10s\t%-10s\t\n","���~�W��","���~����","�ʶR�ƶq","���~���");
		double total=0;
		for(int i=0;i<4;i++) {
			System.out.printf("%-10s\t%-10s\t%-10s\t%-10s\t\n",inv[i].getBrand(),inv[i].getDescription(),inv[i].getQuantity(),inv[i].getPrice());
			//System.out.println(inv[i].getBrand()+"\t"+inv[i].getDescription()+"\t"+inv[i].getQuantity()+"\t"+inv[i].getPrice());
			total =total+inv[i].getPrice()*inv[i].getQuantity();
		}
		System.out.println("�`���B : "+total);
		System.out.println("==========�P�±z���ʶR==========");
	}

}
