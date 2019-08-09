
public class QuickFindUF {
private int[] id;
	
	public QuickFindUF(int N)   {							//set id of each object to itself (N array accesses)
		id = new int[N];
		for (int i = 0; i < N; i++)
			this.id[i] = i;
		
	}
	
	public boolean connected(int p, int q)   {				//check whether p and q are in the same component (2 array accesses)
		return this.id[p] == this.id[q];
		
	}
	
	public void union(int p, int q)   {						//change all entries with id[p] to id[q] (at most 2N + 2 array accesses)
		int pid = this.id[p];
		int qid = this.id[q];
		for (int i = 0; i < id.length; i++)
			if (this.id[i] == pid) {
				this.id[i] = qid;
				this.id[i]=qid;
			}
	} 
	
	public int getunion(int i) {
		
		return this.id[i];
	}
}
