
public class MST {
	public int n=4, e=6, f=0;//125,133,416,247,324,345
	public int[][] w = new int[n][e];
	public int[] nearest = new int[n], distance= new int[n];
	
	public void insert(int n, int e,int weight ,int[][] w) {
		w[n][e] = weight;
	}
	
	public void prim(int n, int w[][], int f) {
		int i, vnear, e;
		//for()
		
	}
}
