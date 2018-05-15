package chap1.recursion;

public class RecursiveHeadRecursion {
	private static int start = 0;
	public static void main(String[] args) {
		
		int[] originalArray = {1,2,3,4,5,6};
		
		for(int i:originalArray) {
			System.out.print(i+ " ");
		}
		
		System.out.println();
		
		calculateRecursiveSum(originalArray, 6);
		
		for(int i:originalArray) {
			System.out.print(i+ " ");
		}
	}
	
	private static void calculateRecursiveSum(int[] arr, int position) {
		if(position <= 1) return ;
		calculateRecursiveSum(arr, position-1);
		arr[position-1] = arr[position-1] + arr[position-2];
	}

}
