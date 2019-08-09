//子類別
class Rabbit extends Animal{
	Rabbit(String name){
		setname(name);
		System.out.println("Hi, Raabit "+ name);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		String a=getname();
		System.out.println(a+" is jumping...");
	}
	
}

class Fox extends Animal{
	Fox(String name){
		setname(name);
		System.out.println("Hi, Fox "+ name);
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		String a=getname();
		System.out.println(a+" is walking...");
	}
}

class Sheep extends Animal{
	Sheep(String name){
		setname(name);
		System.out.println("Hi, Sheep "+ name);
	}
	
}

class Lion extends Animal{
	Lion(String name){
		setname(name);
		System.out.println("Hi, Lion "+name);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		String a=getname();
		System.out.println(a+" is running...");
	}
	
	
}

//父類別
class Animal{
	private String name;
	void setname(String name) {
		this.name=name;
	}
	String getname(){
		return this.name;
	}
	public void eat(){
		System.out.println(this.name+" is eating...");
	}
	public void sleep(){
		System.out.println(this.name+" is sleeping...");
	}
	public void move(){
		System.out.println(this.name+" is moving...");
	}
}

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rabbit r = new Rabbit("Judy");
		Fox f = new Fox("Nick");
		Sheep s = new Sheep("Dawn");
		Lion l = new Lion("Leodore");
		System.out.println();
		
		r.sleep();
		f.sleep();
		
		r.move();
		f.move();
		s.move();
		l.move();
	}

}
