
public class sss {

	public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			double r1,r2,r3,r4,r3p;
			double t2,t3,t4,dt3,dt4;
			double lower,upper,step,e;
			double e1,e2,Xc,Yc;
			int i,flag= 0;
			//
			//

			r1= 3.26;
			
			r2= 1.898;
			r3= 3.547;
			r4= 3.231;
			r3p= 4.682;
			lower= 0;					//�U�ɬ�0��
			upper= 360;					//�W�ɬ�360��
			step=3;					//�C10�ץX�@�����G
			t3= 70*Math.PI/180;			//����3����
			t4= 120*Math.PI/180;		//����4����
			lower= 0;					//�U�ɬ�0��
			upper= 360;					//�W�ɬ�360��
			step= 10;					//�C10�ץX�@�����G
			e= 0.01*Math.PI/180;		//�~�t��0.01�ץH�U
			System.out.println("Theta2\t\ttheta3\t\ttheta4\t\tXc\t\tYc");
			System.out.println("_____________________________________________________________________________");
				
			for(i=(int)lower;i<=upper;i+=(int)step) {		//�C10����ܤ@�����G
				flag= 0;
				t2= i*Math.PI/180;		//t2��
				do {
					e1= r2*Math.cos(t2)+r3*Math.cos(t3)-r4*Math.cos(t4)-r1;
					e2= r2*Math.sin(t2)+r3*Math.sin(t3)-r4*Math.sin(t4);
					dt3= (e1*Math.cos(t4)+e2*Math.sin(t4))/(r3*Math.sin(t3-t4));		//t3�ץ���
					dt4= (e1*Math.cos(t3)+e2*Math.sin(t3))/(r4*Math.sin(t3-t4));		//t4�ץ���
					t3+=dt3;		//t3�ץ�
					t4+=dt4;		//t4�ץ�
					
					if(Math.abs(dt3)<e&&Math.abs(dt4)<e)flag=1;
		
				}while(flag==0);
				Xc=r2*Math.cos(t2)+r3p*Math.cos(t3);
				Yc=r2*Math.sin(t2)+r3p*Math.sin(t3);
				System.out.printf("%7.1f\t\t%7.3f\t\t%7.3f\t\t%7.3f\t\t%7.3f\n",
						t2*180/Math.PI,t3*180/Math.PI,t4*180/Math.PI,Xc,Yc);

			}
		}
}
