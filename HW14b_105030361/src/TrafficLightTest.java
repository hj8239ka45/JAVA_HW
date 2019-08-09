public class TrafficLightTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		TrafficLight trafficlight =TrafficLight.Green;
		int t=0;
		while(true){
			for(int i=9;i>=0;i--) {
			if(i==9)System.out.print(trafficlight.getColor()+trafficlight.toString()+"\n");
			Thread.sleep(100);
			System.out.println(i+1);
			}
			trafficlight=change(trafficlight);
			
			if(trafficlight.getColor().equals("ºñ¿O"))t++;
			if(t==1) {
				System.out.print(trafficlight.getColor()+trafficlight.toString()+"\n");
				break;
			}
		}
	}
	
	public static TrafficLight change(TrafficLight s){
		if(s.getColor().equals("ºñ¿O")) s=TrafficLight.Yellow;
		
		else if(s.getColor().equals("¶À¿O"))s=TrafficLight.Red;
		
		else if(s.getColor().equals("¬õ¿O"))s=TrafficLight.Green;
		
		return s;
	};
}
