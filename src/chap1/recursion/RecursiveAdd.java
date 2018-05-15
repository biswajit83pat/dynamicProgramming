package chap1.recursion;

public class RecursiveAdd {
	private static int start = 0;
	public static void main(String[] args) {
		
		int[] originalArray = {1,2,3,4,5,6};
		
		int[] processedArray = calculateRecursiveSum(originalArray, 1);
		
		for(int i:processedArray) {
			System.out.print(i+ " ");
		}
	}
	
	private static int[] calculateRecursiveSum(int[] arr, int position) {
		if(position == arr.length) return arr;
		arr[position] = arr[position] + arr[position-1];
		return calculateRecursiveSum(arr, position+1);
	}

}
