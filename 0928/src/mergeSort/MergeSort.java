package mergeSort;

public class MergeSort {
	
	int[] data = {7, 5, 9, 3, 6, 2};
	int n = 6;
	int[] temp = new int[n];
	
	public void mergeSort(int low, int high) {
		if(low >= high) {
			
		}
		else {
			int mid = (int)((low+high)/2);
			mergeSort(low, mid);
			mergeSort(mid+1, high);
			
			int leftIndex = low;
			int rightIndex = mid+1;
			int tempIndex = low;
			
			while((leftIndex <= mid) && (rightIndex <= high)) {
				if(data[leftIndex] < data[rightIndex]) {
					temp[tempIndex++] = data[leftIndex++];
				}
				else {
					temp[tempIndex++] = data[rightIndex++];
				}
			}
			
			if(leftIndex > mid) {
				while(rightIndex <= high) {
					temp[tempIndex++] = data[rightIndex++];
				}
			}
			else if(rightIndex >= high) {
				while(leftIndex <= mid) {
					temp[tempIndex++] = data[leftIndex++];
				}
			}
			for(int i=low; i<=high; i++) {
				data[i] = temp[i];
			}
		}
	}
	
	public void go() {
		mergeSort(0, n-1);
		for(int i=0; i<n; i++) {
			System.out.println(data[i]);
		}
	}
}
