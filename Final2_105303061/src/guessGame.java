import java.util.Scanner;

public class guessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("請輸入指令(Start以開始，End已結束):");
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
					System.out.println("請輸入四個不重複數字");
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
			System.out.println("遊戲結束，你共猜了"+guess+"次，重玩請輸入Start，結束請輸入End :");
			check=scan.nextLine();
		}
		System.out.println("遊戲結束");
	}

}
