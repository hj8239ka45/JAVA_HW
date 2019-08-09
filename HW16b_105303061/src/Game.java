
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] land = { "中華⺠國","⽇本","韓國","菲律賓","⾺來⻄亞","越南","泰國","印度","伊拉克","伊朗","沙烏地阿拉伯",
						  "⼟耳其","以⾊列","蘇俄","波蘭","德國","奧地利","瑞⼠","法國","比利時","荷蘭","英國","芬蘭","瑞典",
						  "丹麥","希臘","義⼤利","⻄班牙","葡萄牙","埃及","摩洛哥","南非","加拿⼤","美國","墨⻄哥","宏都拉斯",
						  "尼加拉瓜","古巴","巴拿⾺","巴⻄"
						};
		String[] PN = { "A", "B", "C", "D" };
		Land[] place = new Land[land.length];
		Player[] p = new Player[PN.length];
		for (int i = 0; i < land.length; i++) {
			place[i] = new Land(land[i], (int) (Math.random() * 1000) + 1);
		}
		
		p[0]=new Happy(PN[0]); //A是快樂的⼈, 100%購買率
		p[1]=new Hesitated(PN[1]); //B是猶豫的⼈, 50%購買率
		p[2]=new Hesitated(PN[2]); //C是猶豫的⼈, 50%購買率
		p[3]=new Stingy(PN[3]); //D是⼩氣的⼈, 0%購買率
		int Eround =50;
		for(int round=0;round<Eround;round++) {
			for(int i=0;i<4;i++) {
				//移動
				p[i].move();
				System.out.println(p[i].getname()+"走了"+p[i].random+"步");
				System.out.println(p[i].getname()+"在"+land[p[i].location]+",現在有"+p[i].getmoney()+"錢");
				if(place[p[i].location].owner==p[i]) {
					System.out.println(p[i].getname()+"走到了自己的地");
				}
				else if(place[p[i].location].owner!=p[i]&&place[p[i].location].owner!=null) {
					System.out.println(land[p[i].location]+" 屬於 "+place[p[i].location].name);
					System.out.println(p[i].getname()+"要付給"+place[p[i].location].name+"過路費"+place[p[i].location].getprice()/2);
					p[i].payPrice(place[p[i].location]);
					place[p[i].location].owner.getPrice(place[p[i].location]);
					System.out.println(p[i].getname()+"在"+land[p[i].location]+"，現在有錢"+p[i].getmoney());
					
				}
				else {
					System.out.println(land[p[i].location]+" 目前尚未售出，地價為"+place[p[i].location].getprice());
				
					//Hesitated
					if(p[i].getcheck()==0) {
						System.out.print(p[i].getname()+"猶豫了很久");
						if(p[i].buyStrategy()) {
							System.out.println("，最後還是決定買了");
							if(p[i].getmoney()-place[p[i].location].getprice()>0) {
								place[p[i].location].setOwner(p[i]);
								System.out.println(p[i].getname()+"買了"+land[p[i].location]+"現在有錢"+p[i].getmoney());
							}
							else 
								System.out.println("由於現金不足，"+p[i].getname()+"沒有買地");
						}
						else 
							System.out.println("，最後還是決定不買");
					}
					
					//Happy
					if(p[i].getcheck()==1) {
						if(p[i].buyStrategy()==true) {
							System.out.println(p[i].getname()+"心情好，買買買都買");
							if(p[i].getmoney()-place[p[i].location].getprice()>0) {
								place[p[i].location].setOwner(p[i]);
								System.out.println(p[i].getname()+"買了 "+land[p[i].location]+" ，現在有錢"+p[i].getmoney());
							}
							else 
								System.out.println("由於現金不足，"+p[i].getname()+"沒有買地");
						}
					}
					
					//Stingy
					if(p[i].getcheck()==2) {
						if(!p[i].buyStrategy()==true) {
							System.out.println(p[i].getname()+"是個小氣的人，打死不買");
						}
					}
				}
				System.out.println("------------------");
			}
		}
		int []tmp=new int[4];
		
		for(int i=0;i<4;i++) {
			tmp[i]=p[i].getmoney();
			
		}
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<i;j++) {
				int temp;
				Player pl;
				if(tmp[i]>tmp[j]) {
					temp=tmp[i];tmp[i]=tmp[j];tmp[j]=temp;
					pl=p[i];p[i]=p[j];p[j]=pl;
				}
			}
		}
		for(int i=0;i<4;i++)
		System.out.println("第"+(i+1)+"名為 "+p[i].getname()+"，總共有 "+tmp[i]+"元");
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n__________________________________________________");
		System.out.println("清算房地產");
		int []num=new int[4];
		for(int i=0;i< land.length;i++) {
			if(place[i].owner==p[0]) {
				num[0]+=place[i].getprice();
			}
			if(place[i].owner==p[1]) {
				num[1]+=place[i].getprice();
			}
			if(place[i].owner==p[2]) {
				num[2]+=place[i].getprice();
			}
			if(place[i].owner==p[3]) {
				num[2]+=place[i].getprice();
			}
		}
		for(int i=0;i<4;i++) {
			switch(i+1) {
			case 1:
				System.out.println(p[0].getname()+"有"+num[0]+"房地產");
				break;
			case 2:
				System.out.println(p[1].getname()+"有"+num[1]+"房地產");
				break;
			case 3:
				System.out.println(p[2].getname()+"有"+num[2]+"房地產");
				break;
			case 4:
				System.out.println(p[3].getname()+"有"+num[3]+"房地產");
				break;
			}
		}
		
	}

}
