
public class Animal {
	private String name;
	private String sex;
	private String year;
	private Date time;
	public void setAnimal(String name,String sex,String year,Date time) {//
		this.name=name;
		this.sex=sex;
		this.year=year;
		this.time=time;
	}
	public String toString() {
		return String.format("%s\t%s\t%s\t%s\n",this.name,this.sex,this.year,this.time);
	}
}
