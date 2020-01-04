package ArrayRelated;

public class QuickSort {
	
	public static void main(String arg[]) {
		 int list[] = {10,23,54,12,45,87,34,53,04};
		 int lSize = list.length;
		 int lo = 0;
		 int hi = lSize-1;
		
		 int pivot = medianIndex(lo, hi);
		 sort(list, pivot);
		
	}
	
	private static int medianIndex(int low,int high){
		int ind =  low + (high - low)/2;
		 return ind;
	}
	
	private static int[] sort(int arr[],int pi) {
		int tmp[] = new int[arr.length];
		//tmp[0]=arr[pi];
		int piVal = arr[pi];
		int sPos = 0;
		int mPos = pi+1;
		for(int i = 0 ;i < arr.length; i++) {
			if(arr[i]<piVal) {
				tmp[sPos] = arr[i];
				sPos = sPos +1;				
			}else if(arr[i] == piVal){
				tmp[pi] = arr[i];
			}else {
				tmp[mPos] = arr[i];
				mPos = mPos +1;
			}
				
		}
		
		return tmp;
	}
	
	
	
	
	

}
