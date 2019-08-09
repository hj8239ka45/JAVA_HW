
public enum TrafficLight {
	Green("綠燈"),
	Yellow("黃燈"),
	Red("紅燈");
	private final String color;												//final 不再更動
	TrafficLight(String color){											//取上列()內容
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	public String toString() {
		switch(this) {
		case Green: return ",請通行";
		case Yellow: return ",請減速";
		case Red: return ",請停車";
		default : return null;
		}
	}
}
