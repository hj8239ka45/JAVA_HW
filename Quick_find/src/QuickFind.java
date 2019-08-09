
public class QuickFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int info = 5;
		QuickFindUF qf_uf = new QuickFindUF(info);
		int x,y;
		for(int p=0;p<info;p++) {
			for(int q=0;q<info;q++) {
				x=(int) (Math.random()*5);
				y=(int) (Math.random()*5);
				
				if(!qf_uf.connected(x, y)) {
					qf_uf.union(x, y);
					for(int i=0;i<info;i++) {
						System.out.print(i);
					}
					System.out.println();
					for(int i=0;i<info;i++) {
						System.out.print(qf_uf.getunion(i));
					}
					System.out.println();
					System.out.println();
				}
			}
		}
		
	}

}
