
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total_sale=0;
		Fruit [] basket=new Fruit[4];
		basket[0]=new Orange(15,4);
		basket[1]=new Papaya(10,6);
		basket[2]=new Pineapple(50,1);
		basket[3]=new Cherry(200,3);
		
		for(int i=0;i<4;i++){
			total_sale += basket[i].calc();
	      }
		System.out.printf("所購買的水果總共價格為:%d\n",total_sale);
	}

}
