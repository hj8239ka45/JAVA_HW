public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Room [] room=new Room[5];
			for(int i=0;i<5;i++){
				room[i] = new Room();
		      }
		room[0].calculate(2);
		room[1].calculate(3,4);
		room[2].calculate(3,2,true);
		room[3].calculate(2,3,true,true);
		room[4].calculate(4,4,false,false);
	}
}
