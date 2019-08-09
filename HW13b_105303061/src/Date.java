
public class Date {
	private int year; //1-12
	private int month;//1-31
	private int day;  //1-31
	public Date(int month,int day,int year) {
		if(month<1||month>12)
			throw new IllegalArgumentException("month("+month+") must be 1-12");
		if(day<1||day>31)
			throw new IllegalArgumentException("day("+day+") must be 1-31");
		this.year=year;
		this.month=month;
		this.day=day;
		//System.out.printf("Date : %s\n",this);
	}
	public String toString() {
		return String.format("%d/%d/%d",month,day,year);
	}
}
