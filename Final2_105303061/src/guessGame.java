import java.util.Scanner;

public class guessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("�п�J���O(Start�H�}�l�AEnd�w����):");
		String check=scan.nextLine();
		
		while(check.equals("Start")){
			String num;
			int guess=0;
			boolean flag;
			int a[]=new int[4];
			do{
				flag=false;
				a[0]=(int)(Math.random()*10);
				a[1]=(int)(Math.random()*10);
				a[2]=(int)(Math.random()*10);
				a[3]=(int)(Math.random()*10);
				
				for(int i=0;i<4;i++) {
					for(int j=0;j<i;j++) {
						if(a[i]==a[j])flag=true;
					}
				}
			}while(flag);
			System.out.printf("Answer: [%d ,%d ,%d ,%d]\n",a[0],a[1],a[2],a[3]);
			
			int temp[]=new int[4];
			char ch[]=new char[4];
			
			boolean Allright=false;
			while(!Allright) {
				do {
					flag=false;
					System.out.println("�п�J�|�Ӥ����ƼƦr");
					num=scan.nextLine();
					for(int t=0;t<4;t++) {
						ch[t]=num.charAt(t);
						temp[t]=ch[t]-48;
					}
					for(int i=0;i<4;i++) 
						for(int j=0;j<i;j++) {
							if(temp[i]==temp[j])flag=true;
						}
				}while(flag);
				int change=0;
				int right=0;
				guess=guess+1;
				for(int i=0;i<4;i++) {
					if(a[i]==temp[i])right=right+1;
					for(int j=0;j<4;j++) {
						if(i!=j)if(a[i]==temp[j]) {
							change=change+1;
						}
						if(right==4)Allright=true;
					}
				}
				System.out.println(" * "+right+" A "+change+" B "+" * \n\n");
				
			}
			
			//
			System.out.println("�C�������A�A�@�q�F"+guess+"���A�����п�JStart�A�����п�JEnd :");
			check=scan.nextLine();
		}
		System.out.println("�C������");
	}

}
