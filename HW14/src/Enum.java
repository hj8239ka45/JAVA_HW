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
		//���1. 2.
		
		System.out.println("�п�J��ӼҦ�");
		Scanner scan=new Scanner(System.in);
		int num =scan.nextInt();
				//�]�wmode2 ��enum�����.�����k
		mode mode2=mode.Smile;
				//���ܱ�����
		System.out.println("�z��ܪ��O: "+mode2.chosingmode(num));
		
		
		for(mode mode1:mode.values())
			if(mode1.getnum()==num)
				System.out.println("�z��ܪ��O: "+mode1.toString2());
		
	}
}
