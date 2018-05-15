package chap1.recursion;

public class BubbleSortViaRecursion {
	
	private static int temp = 0;
	
	public static void bubbleSort(int[] arr, int n) {
		if(n == 0)return;
		for(int i = 0; i <n -1; i++) {
			if(arr[i]>arr[i+1]) {
				//swap the values
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		bubbleSort(arr, n-1);
	}
	
	public static void main(String[] args) {
		int arr[] = {9,6,2,12,11,9,3,7};
		
		System.out.println("Loading..");
		traverseArray(arr);
		System.out.println("Sorting..");
		bubbleSort(arr, 8);
		traverseArray(arr);
	}
	
	public static void traverseArray(int[] arr) {
		for(int i : arr) {
			System.out.printf("%d ",i, "\t");
		}
	}
}