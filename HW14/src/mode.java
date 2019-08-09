
public enum mode {
	Common(1,"ll"),
	Smart(2,"kk"),
	Hdr(3,"tt"),
	Smile(4,"aa"),
	Selfie(5,"cc");
	private final int num;												//final ���A���
	private final String name;
	mode(int num,String name){											//���W�C()���e
		this.num=num;
		this.name=name;
	}
	
	public int getnum() {
		return this.num;
	}
	//////
	public String chosingmode(int num) {
		switch(num) {
		case 1: return "common ���q�Ҧ�";
		case 2: return "Smart ���z�Ҧ�";
		case 3: return "Hdr �f���Ҧ�";
		case 4: return "Smile �L���Ҧ�";
		case 5: return "Selfie �۩�Ҧ�";
		default : return null;
		}
	}
	//////
	public String toString() {
		switch(this) {
		case Common: return this.num+": common ���q�Ҧ�";
		case Smart: return this.num+": Smart ���z�Ҧ�";
		case Hdr: return this.num+": Hdr �f���Ҧ�";
		case Smile: return this.num+": Smile �L���Ҧ�";
		case Selfie: return this.num+": Selfie �۩�Ҧ�";
		default : return null;
		}
	}
	public String toString2() {
		switch(this) {
		case Common: return " ���q�Ҧ�";
		case Smart: return " ���z�Ҧ�";
		case Hdr: return " �f���Ҧ�";
		case Smile: return " �L���Ҧ�";
		case Selfie: return " �۩�Ҧ�";
		default : return null;
		}
	}
}