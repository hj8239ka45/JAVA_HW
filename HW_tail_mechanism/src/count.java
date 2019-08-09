
public class count {
	private double t3,t4;
	private int flag =1;
	
	public void setTheta(double t2,double t3,double t4) {
		double e1,e2,dt3,dt4,r2,r3,r4,r1;
		r1= 3.26;
		r2= 1.898;
		r3= 3.547;
		r4= 3.231;
		double e=0.01*Math.PI/180;		//誤差至0.01度以下
		do {
			e1= r2*Math.cos(t2)+r3*Math.cos(t3)-r4*Math.cos(t4)-r1;
			e2= r2*Math.sin(t2)+r3*Math.sin(t3)-r4*Math.sin(t4);
			dt3= (e1*Math.cos(t4)+e2*Math.sin(t4))/(r3*Math.sin(t3-t4));		//t3修正值
			dt4= (e1*Math.cos(t3)+e2*Math.sin(t3))/(r4*Math.sin(t3-t4));		//t4修正值
			t3+=dt3;		//t3修正
			t4+=dt4;		//t4修正
			if(Math.abs(dt3)<e&&Math.abs(dt4)<e)flag=1;
		}while(flag==0);
		
		this.t3=t3;
		this.t4=t4;
	}
	
	public double getTheta3() {
		return this.t3;
	}
	
	public double getTheta4() {
		return this.t4;
	}
}
