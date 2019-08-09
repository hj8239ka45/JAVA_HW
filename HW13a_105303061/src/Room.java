import java.util.Random;

public class Room {
	private int days=0;
	private int people=0;
	private boolean breakfast=true;
	private boolean cash=true;
	private double money=0;
	private int num=0;
	Random random=new Random();
	
	public Room(){
		int num=random.nextInt(1000)+1;
		this.num=num;
		System.out.printf("Room #%d was created!\n",this.num);
	}
	
	public double calculate(int days) {
		this.days=days;
		this.money=this.days*1500;
		System.out.printf("房間編號%d,共%d元\n",this.num,(int)this.money);
		return this.money;
	}
	
	public double calculate(int days,int people) {
		this.days=days;
		this.people=people;
		this.money=this.days*(1000+this.people*500);
		System.out.printf("房間編號%d,共%d元\n",this.num,(int)this.money);
		return this.money;
	}
	
	public double calculate(int days,int people,boolean breakfast) {
		this.days=days;
		this.people=people;
		this.breakfast=breakfast;
		if(this.breakfast)
			this.money=this.days*(1000+this.people*500+100*this.people);
		else
			this.money=this.days*(1000+this.people*500);
		System.out.printf("房間編號%d,共%d元\n",this.num,(int)this.money);
		return this.money;
	}
	
	public double calculate(int days,int people,boolean breakfast,boolean cash) {
		this.days=days;
		this.people=people;
		this.breakfast=breakfast;
		this.cash=cash;
		if(this.breakfast)
			this.money=this.days*(1000+this.people*500+100*this.people);
		else
			this.money=this.days*(1000+this.people*500);
		if(!this.cash)
			this.money= this.money*1.1;
		System.out.printf("房間編號%d,共%d元\n",this.num,(int)this.money);
		return this.money;
		
	}
}
