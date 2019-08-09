
public class num {

	static int FindMax;
	static int FindMin;
	
	
	public static void Num (int n,int s,int k){
		int tmp =k;
		FindMax=n;
		FindMin=s;
		if(FindMin>tmp) {int tmp2=FindMin;FindMin=tmp;tmp=tmp2;}
		if(FindMin>FindMax) {int tmp2=FindMin;FindMin=FindMax;FindMax=tmp2;}
		if(FindMax<tmp) {FindMax=tmp;}
	}
	
	public static int getmaxnum() {
		return  FindMax;
	}
	public static int getminnum() {
		return  FindMin;
	}
	public static int getcross() {
		return  FindMin*FindMax;
	}
}
