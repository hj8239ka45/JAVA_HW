import java.util.Random;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Random random = new Random();

									////	���ͤ����ü�		////
		int t=0;
		int num_win[]=new int[20];											//�����Ǹ��ü�
		int num_win_ch[]=new int[5];										//�����Ǹ��x�}²����
		int num_computer[]=new int[20];										//�q���︹�ü�
		int num[]=new int[5];												//���ݹ���Ǹ��x�}
		
		for(int i=0;i<num_win.length;i++) {									//�k�s
			num_win[i]=0;
		}
		for(int i=0;i<5;i++) {												//�P�_�O�_�Ʀr����
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
			//System.out.printf("�����Ʀr%3d�b��%3d�x����\n",num_win[aa],aa);//����
			num_win_ch[i]=num_win[aa];
		}
		
		
									////	�����üƵ���		////
		
		int test=0;
		do {
			System.out.println("�ۿ︹�X�п�J1\t�q���︹�п�J2:");
			test=scan.nextInt();
		}while(!(test==1||test==2));
		String str=scan.nextLine();
		
											//�ۤv�︹start
		if(test==1){
			do {
				t=0;														//��l�S��������~
				System.out.println("�п�J���Ӥj�ֳz���X�åB�H�Ů�j�}:");
				str=scan.nextLine();
				String a[]=str.split(" ");
				
									////	���~�P���}�l		////				
				if(a.length!=5) {											////�ƶq���~:
					System.out.println("��J�j�ֳz���X�ƶq����!!!");
					t=1;													//��������~
				}
				if(t==0){
					for(int b=0;b<a.length;b++) {
						num[b]=Integer.parseInt(a[b]);
						//System.out.println(num[b]);  //����
						for(int doub=0;doub<b;doub++) {						////���ƿ��~:
							if(num[b]==num[doub]) {
								System.out.println("���ƼƦr�Э��s��J!!!");
								t=1;										//��������~
								break;
							}
						}
						if(t==1)break;
					}
				}
				if(t==0)
					for(int b=0;b<a.length;b++) {
						if(num[b]<0||num[b]>20) {							////�d����~:
							System.out.println("�W�X�d��Э��s��J!!!");
							t=1;											//��������~
							break;
						}
					}
									////	���~�P������		////
			}while(t!=0);													//�˴��O�_�����~
		}
											//�ۤv�︹end
											//�q���︹start
		if(test==2){
			for(int i=0;i<num_computer.length;i++) {						//�k�s
				num_computer[i]=0;
			}
			for(int i=0;i<5;i++) {											//�P�_�O�_�Ʀr����
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
											//�q���︹end

		System.out.printf("�z�����X�� : ");
		for(int i=0;i<5;i++) {												//��ܦۤv�����X
			System.out.printf("%4d",num[i]);
		}
		System.out.println();
		int strick_num=0;													//�������X��
		System.out.printf("�}�����Ʀr�� : ");
		
		for(int i=0;i<5;i++) {												//��ܶ}�����X
			System.out.printf("%4d",num_win_ch[i]);
			for(int k=0;k<5;k++) {
				if(num[i]==num_win_ch[k]) {
					strick_num++;
				}
			}
		}
		System.out.println();
		//System.out.println(strick_num);									//�������X��
		
		switch(strick_num) {
		case 0:
			
		case 1:
			
		case 2:
			System.out.println("���¦A�s��@_@");
			break;
		case 3:
			
		case 4:
			
		case 5:
			System.out.println("���ߧA����");
			break;
		}
		
		
	}
}
