
public class Boss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room[] rooms=new Room[4];
		rooms[0]=new Condo("123","Alice",1000,true);
		rooms[1]=new Condo("456","Eric",1000,false);
		rooms[2]=new Studio("789","May",1000,true);
		rooms[3]=new Studio("012","Lily",1000,false);
		
		for(Room room : rooms) {
			System.out.println(room);
		}
		
		
	}

}
