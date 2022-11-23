package queensProblem;
import java.util.Arrays;

public class QueensProblem {
	
	private int n=0;
	private int[] col;
	
	public QueensProblem(int n) {
		this.n = n;
		col = new int[n+1];
	}
	
	public void queens(int q) {
		
		if(promissing(q)) {
			if(q==n) System.out.println(Arrays.toString(col)+"\n");
			else {
				for(int j=1; j<=n; j++) {
					col[q+1] = j;
					queens(q+1);
				}
			}
		}
	}
	
	public boolean promissing(int i) {
		int k=1;
		boolean non_overlap = true;
		
		while(k < i && non_overlap) {
			if(col[k] == col[i] || Math.abs(col[k]-col[i]) == Math.abs(k-i)) non_overlap = false;
			k++;
		}
		return non_overlap;
	}
}
