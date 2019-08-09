import java.util.Scanner;

public class SCAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		double height,weight;
		String name;
		double BMI;
		
		System.out.print("名字:");
		name = scan.nextLine();
		System.out.print("身高(公分):");
		height=scan.nextDouble()/100;
		System.out.print("體重(公斤):");
		weight=scan.nextDouble();
		
		BMI=weight/(height*height);
		System.out.printf("BMI(整數):%d\n",(int)BMI);
		System.out.printf("BMI(浮點數):%f\n",BMI);
	}

}
