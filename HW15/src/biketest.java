
public class biketest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wheel wheel_1=new Wheel("t",16,2000);
		Wheel wheel_2=new Wheel("y",20,3000);
		
		Frame frame_1=new Frame("m","steel",2000);
		Frame frame_2=new Frame("b","steel",3000);
		Frame frame_3=new Frame("a","alu",5000);
		
		Bicycle bike_1=new Bicycle(frame_1,wheel_2);
		Bicycle bike_2=new Bicycle(frame_3,wheel_2);
		
		System.out.printf("�Ĥ@�x�ۦ樮�����欰%s\n", bike_1.getcost());
		System.out.printf("�ĤG�x�ۦ樮�����欰%s\n", bike_2.getcost());
		bike_2.changeWheel(wheel_1);
		System.out.printf("�ĤG�x�ۦ樮�����l�᪺���欰%s\n", bike_2.getcost());
		bike_2.changeFrame(frame_2);
		System.out.printf("�ĤG�x�ۦ樮�����[�᪺���欰%s\n", bike_2.getcost());
		System.out.printf("�ثe�@��%d�x��", Bicycle.getQuantity());
	}

}
