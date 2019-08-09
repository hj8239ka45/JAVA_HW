
public enum TrafficLight {
	Green("��O"),
	Yellow("���O"),
	Red("���O");
	private final String color;												//final ���A���
	TrafficLight(String color){											//���W�C()���e
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	public String toString() {
		switch(this) {
		case Green: return ",�гq��";
		case Yellow: return ",�д�t";
		case Red: return ",�а���";
		default : return null;
		}
	}
}
