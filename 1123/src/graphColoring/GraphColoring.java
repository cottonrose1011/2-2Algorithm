package graphColoring;

import java.util.Arrays;

public class GraphColoring {
	int color = 3; //num of color 0,1,2
	int[][] w= {{0,1,1,1},{1,0,1,0},{1,1,0,1},{1,0,1,0}};
	int landCount = 4; //num of node 0,1,2,3
	int[] vcolor = new int[landCount];
	
	
	public void coloring(int land) {
		
		if(promssing(land)) {
			if(land==landCount-1) System.out.println(Arrays.toString(vcolor));
			
			else {
				for(int i=0; i<=color; i++) {
					vcolor[land+1] = i;
					coloring(land+1);
				}
			}
		}
	}
	
	public boolean promssing(int land) {
		if(land == -1) return true;
		else {
			for(int i=0; i<land; i++) {
				if(w[i][land] == 1)
					if(vcolor[i] == vcolor[land]) return false;
			}
		}
		return true;
	}
}
