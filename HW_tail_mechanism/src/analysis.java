
import java.awt.Graphics;

import javax.swing.JFrame;

public class analysis {
	static double r1,r2,r3,r4,r3p,omega2,omega3,omega4,p1_x,p2_x,p3_x,p4_x,p_I13_x,pc_x;
	static double t2,t3p,dt3,dt4,p1_y,p2_y,p3_y,p4_y,p_I13_y,pc_y;
	static int flag= 0;
	static double t3=32.53*Math.PI/180;
	static double t4=47.25*Math.PI/180;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//
		System.out.println("齒輪傳遞速率: ω1=2π(rad/s)  r1=0.4(m)  r2=0.562(m)  V1=ω1*r1=ω2*r2 ，所以ω2≒4.47(rad/s)\n");
		//
		double lower,upper,step;
		int i;
		omega2=4.47;
		r1= 3.26;
		p1_x=0;p1_y=0;
		r2= 1.898;
		r3= 3.547;
		r4= 3.231;
		p4_x=3.26;p4_y=-0.012;
		r3p= 4.682;
		lower= 0;					//下界為0度
		upper= 360;					//上界為360度
		step=3;					//每10度出一次結果
		
		//System.out.println(" Theta2\t\tomega3\t\tPoint Cx\tPoint Cy\tPoint I14x\tPoint I14y\tVc");
		System.out.println(" Theta2\t\tomega3\t\t Vc");
		System.out.println("_____________________________________________________________________________________________________");
			
		for(i=(int)lower;i<=upper;i+=(int)step) {		//每10度顯示一次結果
			flag= 0;
			t2= i*Math.PI/180;		//t2值
			display(t2);
			
			if(t2*180/Math.PI==160) {
				t2=168.65*Math.PI/180;
				System.out.print("->");
				display(t2);
			}
		}
		/*
		 for(i=(int)lower;i<=upper;i+=(int)step) {		//每10度顯示一次結果
			flag= 0;
			t2= i*Math.PI/180;		//t2值
			do {
				e1= r2*Math.cos(t2)+r3*Math.cos(t3)-r4*Math.cos(t4)-r1;
				e2= r2*Math.sin(t2)+r3*Math.sin(t3)-r4*Math.sin(t4);
				dt3= (e1*Math.cos(t4)+e2*Math.sin(t4))/(r3*Math.sin(t3-t4));		//t3修正值
				dt4= (e1*Math.cos(t3)+e2*Math.sin(t3))/(r4*Math.sin(t3-t4));		//t4修正值
				t3+=dt3;		//t3修正
				t4+=dt4;		//t4修正
				
				if(Math.abs(dt3)<e&&Math.abs(dt4)<e)flag=1;
	
			}while(flag==0);
		 */
	}
	public static void display(double t2) {
		double e1,e2,e;
		
		count co=new count();
		co.setTheta(t2,t3,t4);
		t3=co.getTheta3();
		t4=co.getTheta4();
		
		//System.out.print(t3+"\t"+t4);
		
		t3p=t3+14.72*Math.PI/180;
		
		p2_x=pointX(p1_x,r2,t2);	//p2_x=p1_x+r1*Math.cos(t2);
		p2_y=pointY(p1_y,r2,t2);	//p2_y=p1_y+r1*Math.sin(t2);
		
		p3_x=pointX(p2_x,r3,t3);	//p3_x=p2_x+r2*Math.cos(t3);
		p3_y=pointY(p2_y,r3,t3);	//p3_y=p2_y+r2*Math.sin(t3);
		
		pc_x=pointX(p2_x,r3p,t3p);	//pc_x=p2_x+r3p*Math.cos(t3p);
		pc_y=pointY(p2_y,r3p,t3p);	//pc_y=p2_y+r3p*Math.sin(t3p);
		
		p_I13_x=r4*Math.tan(t4)/(Math.tan(t4)-Math.tan(t2));
		p_I13_y=p_I13_x*Math.tan(t2);
		
		omega3=omega2*r2/(Math.sqrt(Math.pow(p_I13_x-p2_x,2)+Math.pow(p2_y-p_I13_y,2)));
		double vc=omega3*Math.sqrt(Math.pow(pc_x-p_I13_x, 2)+Math.pow(pc_y-p_I13_y, 2));
		
		//System.out.printf("%7.3f     %7.3f    %7.3f\n",p_I13_x-p2_x,p2_y-p_I13_y,Math.pow(p2_x-p_I13_x, 2)+Math.pow(p2_y-p_I13_y, 2));
		//System.out.printf("%7.3f\t\t%7.3f\n",domega3,omega3);
		//System.out.printf("%7.1f\t\t%7.3f\t\t%7.3f\t\t%7.3f\t\t%7.3f\t\t%7.3f\t\t%7.3f\n",t2*180/Math.PI,omega3,pc_x,pc_y,p_I13_x,p_I13_y,vc);
		System.out.printf("%7.1f\t\t%7.3f\t\t%7.4f\n",t2*180/Math.PI,omega3,vc);
		
	}
	static double pointX(double x,double r,double t) {
		return x+r*Math.cos(t);
	}
	static double pointY(double y,double r,double t) {
		return y+r*Math.sin(t);
	}
}
