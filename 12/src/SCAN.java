import java.util.Scanner;

public class SCAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		double height,weight;
		String name;
		double BMI;
		
		System.out.print("�W�r:");
		name = scan.nextLine();
		System.out.print("����(����):");
		height=scan.nextDouble()/100;
		System.out.print("�魫(����):");
		weight=scan.nextDouble();
		
		BMI=weight/(height*height);
		System.out.printf("BMI(���):%d\n",(int)BMI);
		System.out.printf("BMI(�B�I��):%f\n",BMI);
	}

}
