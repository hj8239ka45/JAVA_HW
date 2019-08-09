
public enum mode {
	Common(1,"ll"),
	Smart(2,"kk"),
	Hdr(3,"tt"),
	Smile(4,"aa"),
	Selfie(5,"cc");
	private final int num;												//final ぃ笆
	private final String name;
	mode(int num,String name){											//()ず甧
		this.num=num;
		this.name=name;
	}
	
	public int getnum() {
		return this.num;
	}
	//////
	public String chosingmode(int num) {
		switch(num) {
		case 1: return "common 炊硄家Α";
		case 2: return "Smart 醇紌家Α";
		case 3: return "Hdr 癴家Α";
		case 4: return "Smile 稬家Α";
		case 5: return "Selfie ╃家Α";
		default : return null;
		}
	}
	//////
	public String toString() {
		switch(this) {
		case Common: return this.num+": common 炊硄家Α";
		case Smart: return this.num+": Smart 醇紌家Α";
		case Hdr: return this.num+": Hdr 癴家Α";
		case Smile: return this.num+": Smile 稬家Α";
		case Selfie: return this.num+": Selfie ╃家Α";
		default : return null;
		}
	}
	public String toString2() {
		switch(this) {
		case Common: return " 炊硄家Α";
		case Smart: return " 醇紌家Α";
		case Hdr: return " 癴家Α";
		case Smile: return " 稬家Α";
		case Selfie: return " ╃家Α";
		default : return null;
		}
	}
}